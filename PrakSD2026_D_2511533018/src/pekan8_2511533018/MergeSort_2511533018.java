package pekan8_2511533018;

import pekan8_2511533018.Constants.Angka;
import pekan8_2511533018.Constants.Pesan;
import pekan8_2511533018.Utils.Utils;

public class MergeSort_2511533018 {
    private static void merge_2511533018(int[] arr_3018, int l_3018, int m_3018, int r_3018) {
        int n1_3018 = m_3018 - l_3018 + Angka.SATU;
        int n2_3018 = r_3018 - m_3018;

        int[] L_3018 = new int[n1_3018];
        int[] R_3018 = new int[n2_3018];

        for (int i_3018 = Angka.NOL; i_3018 < n1_3018; ++i_3018) {
            L_3018[i_3018] = arr_3018[l_3018 + i_3018];
        }

        for (int j_3018 = Angka.NOL; j_3018 < n2_3018; ++j_3018) {
            R_3018[j_3018] = arr_3018[m_3018 + Angka.SATU + j_3018];
        }

        int i_3018 = Angka.NOL;
        int j_3018 = Angka.NOL;
        int k_3018 = l_3018;

        while (i_3018 < n1_3018 && j_3018 < n2_3018) {
            if (L_3018[i_3018] <= R_3018[j_3018]) {
                arr_3018[k_3018] = L_3018[i_3018];
                i_3018++;
            } else {
                arr_3018[k_3018] = R_3018[j_3018];
                j_3018++;
            }
            k_3018++;
        }

        while (i_3018 < n1_3018) {
            arr_3018[k_3018] = L_3018[i_3018];
            i_3018++;
            k_3018++;
        }

        while (j_3018 < n2_3018) {
            arr_3018[k_3018] = R_3018[j_3018];
            j_3018++;
            k_3018++;
        }
    }

    private static void sort_2511533018(int[] arr_3018, int l_3018, int r_3018) {
        if (l_3018 < r_3018) {
            int m_3018 = (l_3018 + r_3018) / Angka.DUA;

            sort_2511533018(arr_3018, l_3018, m_3018);
            sort_2511533018(arr_3018, m_3018 + Angka.SATU, r_3018);

            merge_2511533018(arr_3018, l_3018, m_3018, r_3018);
        }
    }

    public static void main(String[] args) {
        int[] arr_3018 = { 12, 11, 13, 5, 6, 7 };

        Utils.printLineStatement(Pesan.SEBELUM_TERURUT);
        Utils.printArray(arr_3018);

        sort_2511533018(arr_3018, Angka.NOL, arr_3018.length - Angka.SATU);
        Utils.printLineStatement(Pesan.SESUDAH_TERURUT);
        Utils.printArray(arr_3018);
    }
}
