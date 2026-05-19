package pekan7_2511533018;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.Serial;

public class InsertionSortGui_2511533018 extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;
    private JLabel[] labelArray_3018;
    private JTextField textField_3018;
    private JButton setArray_3018;
    private final JButton stepButton_3018;
    private final JTextField inputField_3018;
    private final JPanel panelArray_3018;
    private final JTextArea stepArea_3018;

    private int[] array_3018;
    private int i_3018 = 1;
    private boolean sorting_3018 = false;
    private int stepCount = 1;

    // Constructor
    public InsertionSortGui_2511533018() {
        setTitle("Insertion Sort Langkah per Langkah");
        setSize(1750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5,5));

        // Panel Input
        JPanel inputPanel_3018 = new JPanel(new FlowLayout());
        inputField_3018 = new JTextField(30);
        JButton setButton = new JButton("Set Array");
        inputPanel_3018.add(new JLabel("Masukan angka (pisahkan dengan koma): "));
        inputPanel_3018.add(inputField_3018);
        inputPanel_3018.add(setButton);

        // Panel Array Visual
        panelArray_3018 = new JPanel();
        panelArray_3018.setLayout(new FlowLayout());

        // Panel Kontrol
        JPanel controlPanel_3018 = new JPanel();
        stepButton_3018 = new JButton("Langkah Selanjutnya");
        JButton resetButton = new JButton("Reset");
        stepButton_3018.setEnabled(false);
        controlPanel_3018.add(stepButton_3018);
        controlPanel_3018.add(resetButton);

        setContentPane(contentPane);

        // Area teks untuk log langkah-langkah
        stepArea_3018 = new JTextArea(8, 60);
        stepArea_3018.setEditable(false);
        stepArea_3018.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(stepArea_3018);

        // Tambahkan panel ke frame
        add(inputPanel_3018, BorderLayout.NORTH);
        add(panelArray_3018, BorderLayout.CENTER);
        add(controlPanel_3018, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        // Event set Array
        setButton.addActionListener(e -> setArrayFromInput_2511533018());

        // Event langkah selanjutnya
        stepButton_3018.addActionListener(e -> performStep_2511533018());

        // Event reset
        resetButton.addActionListener(e -> reset_2511533018());
    }

    private void setArrayFromInput_2511533018() {
        String text_3018 = inputField_3018.getText().trim();

        if (text_3018.isEmpty())
            return;

        String[] parts_3018 = text_3018.split(",");
        array_3018 = new int[parts_3018.length];

        try {
            for (int k = 0; k < parts_3018.length; k++) {
                array_3018[k] = Integer.parseInt(parts_3018[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukan hanya angka yang dipisahkan "
                + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);

            return;
        }

        i_3018 = 1;
        sorting_3018 = true;
        stepButton_3018.setEnabled(true);
        stepArea_3018.setText("");
        panelArray_3018.removeAll();
        labelArray_3018 = new JLabel[array_3018.length];

        for (int k = 0; k < array_3018.length; k++) {
            labelArray_3018[k] = new JLabel(String.valueOf(array_3018[k]));
            labelArray_3018[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3018[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3018[k].setPreferredSize(new Dimension(50, 50));
            labelArray_3018[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3018.add(labelArray_3018[k]);
        }

        panelArray_3018.revalidate();
        panelArray_3018.repaint();
    }

    private void performStep_2511533018() {
        if (i_3018 < array_3018.length && sorting_3018) {
            int key = array_3018[i_3018];
            int j_3018 = i_3018 - 1;

            StringBuilder stepLog = new StringBuilder();
            stepLog.append("Langkah ").append(stepCount)
                    .append(": Memasukkan ").append(key).append("\n");

            while (j_3018 >= 0 && array_3018[j_3018] > key) {
                array_3018[j_3018 + 1] = array_3018[j_3018];
                j_3018--;
            }

            array_3018[j_3018 + 1] = key;

            updateLabels_2511533018();
            stepLog.append("Hasil: ").append(arrayToString_2511533018(array_3018)).append("\n\n");
            stepArea_3018.append(stepLog.toString());

            i_3018++;
            stepCount++;

            if (i_3018 == array_3018.length) {
                sorting_3018 = false;
                stepButton_3018.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Sorting selesai!");
            }
        }
    }

    private void reset_2511533018() {
        inputField_3018.setText("");
        panelArray_3018.removeAll();
        panelArray_3018.revalidate();
        panelArray_3018.repaint();
        stepArea_3018.setText("");
        stepButton_3018.setEnabled(false);
        sorting_3018 = false;
        i_3018 = 1;
        stepCount = 1;
    }

    private void updateLabels_2511533018() {
        for (int k = 0; k < array_3018.length; k++) {
            labelArray_3018[k].setText(String.valueOf(array_3018[k]));
        }
    }

    private String arrayToString_2511533018(int[] array_3018) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < array_3018.length; k++) {
            sb.append(array_3018[k]);
            if (k < array_3018.length - 1)
                sb.append(", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    InsertionSortGui_2511533018 frame = new InsertionSortGui_2511533018();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
