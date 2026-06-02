package pekan8_2511532014;
import pekan8_2511533018.Constants.Angka;
import pekan8_2511533018.Constants.Bernama;
import pekan8_2511533018.Constants.GuiCostants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511533018 extends JFrame {
    private static final long serialVersionUID = 1L;

    private int[] array_3018;
    private JLabel[] labelArray_3018;
    private JButton stepButton_3018, resetButton_3018, setButton_3018;
    private JTextField inputField_3018;
    private JPanel panelArray_3018;
    private JTextArea stepArea_3018;
    private Queue<int[]> mergeQueue_3018 = new LinkedList<>();
    private int stepCount_3018 = 1;
    private boolean isMerging_3018 = false;
    private boolean copying_3018 = false;
    private int[] temp_3018;
    private int left_3018, mid_3018, right_3018;
    private int i_3018, j_3018, k_3018;

    public MergeSortGUI_2511533018() {
        setTitle("Merge Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // panel input
        JPanel inputPanel_3018 = new JPanel(new FlowLayout());
        inputField_3018 = new JTextField(GuiCostants.TEXT_FIELD_COL_SIZE);
        setButton_3018 = new JButton(Bernama.SET_ARRAY);
        inputPanel_3018.add(new JLabel(Bernama.MASUKAN_ANGKA));
        inputPanel_3018.add(inputField_3018);
        inputPanel_3018.add(setButton_3018);

        // panel array visual
        panelArray_3018 = new JPanel();
        panelArray_3018.setLayout(new FlowLayout());

        // panel kontrol
        JPanel controlPanel_3018 = new JPanel();
        stepButton_3018 = new JButton(Bernama.MASUKAN_ANGKA);
        resetButton_3018 = new JButton(Bernama.RESET);
        controlPanel_3018.add(stepButton_3018);
        controlPanel_3018.add(resetButton_3018);

        // area text untuk log langkah langkah
        stepArea_3018 = new JTextArea(GuiCostants.TEXT_AREA_ROW_SIZE, GuiCostants.TEXT_AREA_COL_SIZE);
        stepArea_3018.setEditable(false);
        stepArea_3018.setFont(new Font(Bernama.MONOSPACE, Font.PLAIN, GuiCostants.FONT_SIZE_SMALL));
        JScrollPane scrollPane_3018 = new JScrollPane(stepArea_3018);

        // tambahkan panel ke frame
        add(inputPanel_3018, BorderLayout.NORTH);
        add(panelArray_3018, BorderLayout.CENTER);
        add(controlPanel_3018, BorderLayout.SOUTH);
        add(scrollPane_3018, BorderLayout.EAST);

        // event set array
        setButton_3018.addActionListener(e -> setArrayFromInput_3018());
        // event selanjutnya
        stepButton_3018.addActionListener(e -> performStep_3018());
        // event reset
        resetButton_3018.addActionListener(e -> reset_3018());
    }

    private void setArrayFromInput_3018() {
        String text_3018 = inputField_3018.getText().trim();
        if (text_3018.isEmpty()) return;

        String[] parts_3018 = text_3018.split(",");
        array_3018 = new int[parts_3018.length];

        try {
            for (int k = 0; k < parts_3018.length; k++) {
                array_3018[k] = Integer.parseInt(parts_3018[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka dengan koma!",
                    Bernama.ERROR, JOptionPane.ERROR_MESSAGE);
            return;
        }

        labelArray_3018 = new JLabel[array_3018.length];
        panelArray_3018.removeAll();
        for (int k = 0; k < array_3018.length; k++) {
            labelArray_3018[k] = new JLabel(String.valueOf(array_3018[k]));
            labelArray_3018[k].setFont(new Font(Bernama.MONOSPACE, Font.BOLD, GuiCostants.FONT_SIZE_MEDIUM));
            labelArray_3018[k].setOpaque(true);
            labelArray_3018[k].setBackground(Color.WHITE);
            labelArray_3018[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3018[k].setPreferredSize(new Dimension(GuiCostants.LABEL_WIDTH, GuiCostants.LABEL_HEIGHT));
            labelArray_3018[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3018.add(labelArray_3018[k]);
        }

        mergeQueue_3018.clear();
        generateMergeSteps_3018(Angka.NOL, array_3018.length - Angka.SATU);
        stepButton_3018.setEnabled(true);
        stepArea_3018.setText("");
        stepCount_3018 = Angka.SATU;
        isMerging_3018 = false;

        panelArray_3018.revalidate();
        panelArray_3018.repaint();
    }

    private void generateMergeSteps_3018(int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / Angka.DUA;
        generateMergeSteps_3018(left, mid);
        generateMergeSteps_3018(mid + Angka.SATU, right);
        mergeQueue_3018.add(new int[]{left, mid, right});
    }

    private void performStep_3018() {
        resetHighlights_3018();

        if (!isMerging_3018 && !mergeQueue_3018.isEmpty()) {
            int[] range_3018 = mergeQueue_3018.poll();
            left_3018 = range_3018[Angka.NOL];
            mid_3018 = range_3018[Angka.SATU];
            right_3018 = range_3018[Angka.DUA];
            temp_3018 = new int[right_3018 - left_3018 + Angka.SATU];
            i_3018 = left_3018;
            j_3018 = mid_3018 + Angka.SATU;
            k_3018 = Angka.NOL;
            copying_3018 = false;
            isMerging_3018 = true;

            stepArea_3018.append("Langkah " + stepCount_3018++ +
                    ": Mulai merge dari " + left_3018 + " ke " + right_3018 + "\n");
            return;
        }

        if (isMerging_3018 && !copying_3018) {
            if (i_3018 <= mid_3018 && j_3018 <= right_3018) {
                labelArray_3018[i_3018].setBackground(Color.CYAN);
                labelArray_3018[j_3018].setBackground(Color.CYAN);

                if (array_3018[i_3018] <= array_3018[j_3018]) {
                    temp_3018[k_3018++] = array_3018[i_3018++];
                } else {
                    temp_3018[k_3018++] = array_3018[j_3018++];
                }
                stepArea_3018.append("Langkah " + stepCount_3018++ + ": Bandingkan dan salin elemen\n");
                return;
            } else if (i_3018 <= mid_3018) {
                temp_3018[k_3018++] = array_3018[i_3018++];
                stepArea_3018.append("Langkah " + stepCount_3018++ + ": Salin sisa kiri\n");
                return;
            } else if (j_3018 <= right_3018) {
                temp_3018[k_3018++] = array_3018[j_3018++];
                stepArea_3018.append("Langkah " + stepCount_3018++ + ": Salin sisa kanan\n");
                return;
            } else {
                copying_3018 = true;
                k_3018 = Angka.NOL;
                return;
            }
        }

        if (copying_3018 && k_3018 < temp_3018.length) {
            array_3018[left_3018 + k_3018] = temp_3018[k_3018];
            labelArray_3018[left_3018 + k_3018].setText(String.valueOf(temp_3018[k_3018]));
            labelArray_3018[left_3018 + k_3018].setBackground(Color.GREEN);
            k_3018++;
            stepArea_3018.append("Langkah " + stepCount_3018++ + ": Tempelkan ke array utama\n");
            return;
        }

        if (copying_3018 && k_3018 == temp_3018.length) {
            isMerging_3018 = false;
            copying_3018 = false;
        }

        if (mergeQueue_3018.isEmpty() && !isMerging_3018) {
            stepArea_3018.append("Selesai.\n");
            stepButton_3018.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void resetHighlights_3018() {
        if (labelArray_3018 == null) return;
        for (JLabel label : labelArray_3018) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset_3018() {
        inputField_3018.setText("");
        panelArray_3018.removeAll();
        panelArray_3018.revalidate();
        panelArray_3018.repaint();
        stepArea_3018.setText("");
        stepButton_3018.setEnabled(false);
        mergeQueue_3018.clear();
        isMerging_3018 = false;
        stepCount_3018 = 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511533018 gui = new MergeSortGUI_2511533018();
            gui.setVisible(true);
        });
    }
}