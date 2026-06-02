package pekan8_2511533018;

import pekan8_2511533018.Constants.Angka;
import pekan8_2511533018.Constants.Pesan;
import pekan8_2511533018.Utils.Utils;

public class ShellSort_2511533018 {

    // shell sort
    private static void shellSort_2511533018(int[] a_3018) {
        int n_3018 = a_3018.length;
        int gap_3018 = n_3018 / Angka.DUA;

        while (gap_3018 > Angka.NOL) {
            for (int i_3018 = gap_3018; i_3018 < n_3018; i_3018++) {
                int temp_3018 = a_3018[i_3018];
                int j_3018 = i_3018;

                while (j_3018 >= gap_3018 && a_3018[j_3018 - gap_3018] > temp_3018) {
                    a_3018[j_3018] = a_3018[j_3018 - gap_3018];
                    j_3018 = j_3018 - gap_3018;
                }
                a_3018[j_3018] = temp_3018;
            }
            gap_3018 = gap_3018 / Angka.DUA;
        }
    }

    public static void main(String[] args) {
        int[] data_3018 = { 3, 10, 4, 6, 8, 9, 7, 2, 1, 5 };

        Utils.printString(Pesan.SEBELUM_TERURUT);
        Utils.printArray(data_3018);

        shellSort_2511533018(data_3018);

        Utils.printString(Pesan.SESUDAH_TERURUT);
        Utils.printArray((data_3018));
    }
}
