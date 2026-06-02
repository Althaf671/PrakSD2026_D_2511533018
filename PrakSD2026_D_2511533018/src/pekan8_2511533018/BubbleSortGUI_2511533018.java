package pekan8_2511533018;

import pekan8_2511533018.Constants.Angka;
import pekan8_2511533018.Constants.GuiCostants;
import pekan8_2511533018.Constants.Bernama;

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

public class BubbleSortGUI_2511533018 extends JFrame {

    private static final long serialVersionUID = 1L;
    private int[] array_3018;
    private JLabel[] labelArray_3018;
    private JButton stepButton_3018, resetButton_3018, setButton_3018;
    private JTextField inputField_3018;
    private JPanel panelArray_3018;
    private JTextArea stepArea_3018;

    private int i_3018 = Angka.NOL;
    private int j_3018 = Angka.NOL;
    private boolean sorting_3018 = false;
    private int stepCount_3018 = Angka.SATU;

    public BubbleSortGUI_2511533018() {
        setTitle(Bernama.BUBBLE_SORT_PERLANGKAH);
        setSize(GuiCostants.FRAME_WIDTH, GuiCostants.FRAME_HEIGHT);
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
        stepButton_3018 = new JButton(Bernama.LANGKAH_SELANJUTNYA);
        resetButton_3018 = new JButton(Bernama.RESET);
        stepArea_3018.setFont(new Font(Bernama.MONOSPACE, Font.PLAIN, GuiCostants.FONT_SIZE_SMALL));

        controlPanel_3018.add(stepButton_3018);
        controlPanel_3018.add(resetButton_3018);

        // area text untuk log langkah langkah
        stepArea_3018 = new JTextArea(GuiCostants.TEXT_AREA_ROW_SIZE, GuiCostants.TEXT_AREA_COL_SIZE);
        stepArea_3018.setEditable(false);
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
            for (int k_3018 = Angka.NOL; k_3018 < parts_3018.length; k_3018++) {
                array_3018[k_3018] = Integer.parseInt(parts_3018[k_3018].trim());
            }
        } catch (NumberFormatException e_3018) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
                    + "yang dipisahkan koma!", Bernama.ERROR, JOptionPane.ERROR_MESSAGE);
            return;
        }

        i_3018 = Angka.NOL;
        j_3018 = Angka.NOL;
        stepCount_3018 = Angka.SATU;
        sorting_3018 = true;
        stepButton_3018.setEnabled(true);
        stepArea_3018.setText("");
        panelArray_3018.removeAll();
        labelArray_3018 = new JLabel[array_3018.length];

        for (int k_3018 = Angka.NOL; k_3018 < array_3018.length; k_3018++) {
            labelArray_3018[k_3018] = new JLabel(String.valueOf(array_3018[k_3018]));
            labelArray_3018[k_3018].setFont(new Font(Bernama.MONOSPACE, Font.BOLD, GuiCostants.FONT_SIZE_MEDIUM));
            labelArray_3018[k_3018].setOpaque(true);
            labelArray_3018[k_3018].setBackground(Color.WHITE);
            labelArray_3018[k_3018].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3018[k_3018].setPreferredSize(new Dimension(GuiCostants.LABEL_WIDTH, GuiCostants.LABEL_HEIGHT));
            labelArray_3018[k_3018].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3018.add(labelArray_3018[k_3018]);
        }

        panelArray_3018.revalidate();
        panelArray_3018.repaint();
    }

    private void performStep_3018() {
        if (!sorting_3018 || i_3018 >= array_3018.length - 1) {
            sorting_3018 = false;
            stepButton_3018.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }

        resetHighlights_3018();
        StringBuilder stepLog_3018 = new StringBuilder();

        labelArray_3018[j_3018].setBackground(Color.CYAN);
        labelArray_3018[j_3018 + Angka.SATU].setBackground(Color.CYAN);

        if (array_3018[j_3018] > array_3018[j_3018 + Angka.SATU]) {
            // Swap
            int temp_3018 = array_3018[j_3018];
            array_3018[j_3018] = array_3018[j_3018 + Angka.SATU];
            array_3018[j_3018 + Angka.SATU] = temp_3018;
            labelArray_3018[j_3018].setBackground(Color.RED);
            labelArray_3018[j_3018 + 1].setBackground(Color.RED);
            stepLog_3018.append("Langkah ").append(stepCount_3018).append(": Menukar elemen ke-")
                    .append(j_3018).append(" (").append(array_3018[j_3018 + Angka.SATU]).append(") dengan ke-")
                    .append(j_3018 + 1).append(" (").append(array_3018[j_3018]).append(")\n");
        } else {
            stepLog_3018.append("Langkah ").append(stepCount_3018).append(": Tidak ada pertukaran antara ke-")
                    .append(j_3018).append(" dan ke-").append(j_3018 + Angka.SATU).append("\n");
        }

        stepLog_3018.append("Hasil: ").append(arrayToString_3018(array_3018)).append("\n\n");
        stepArea_3018.append(stepLog_3018.toString());
        updateLabels_3018();

        j_3018++;
        if (j_3018 >= array_3018.length - i_3018 - Angka.SATU) {
            j_3018 = Angka.NOL;
            i_3018++;
        }
        stepCount_3018++;

        if (i_3018 >= array_3018.length - Angka.SATU) {
            sorting_3018 = false;
            stepButton_3018.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels_3018() {
        for (int k_3018 = Angka.NOL; k_3018 < array_3018.length; k_3018++) {
            labelArray_3018[k_3018].setText(String.valueOf(array_3018[k_3018]));
        }
    }

    private void resetHighlights_3018() {
        for (JLabel label_3018 : labelArray_3018) {
            label_3018.setBackground(Color.WHITE);
        }
    }

    private void reset_3018() {
        inputField_3018.setText("");
        panelArray_3018.removeAll();
        panelArray_3018.revalidate();
        panelArray_3018.repaint();
        stepArea_3018.setText("");
        stepButton_3018.setEnabled(false);
        sorting_3018 = false;
        i_3018 = Angka.NOL;
        j_3018 = Angka.NOL;
        stepCount_3018 = Angka.SATU;
    }

    private String arrayToString_3018(int[] arr_3018) {
        StringBuilder sb_3018 = new StringBuilder();
        for (int k_3018 = Angka.NOL; k_3018 < arr_3018.length; k_3018++) {
            sb_3018.append(arr_3018[k_3018]);
            if (k_3018 < arr_3018.length - Angka.SATU) sb_3018.append(", ");
        }
        return sb_3018.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BubbleSortGUI_2511533018 gui = new BubbleSortGUI_2511533018();
            gui.setVisible(true);
        });
    }
}