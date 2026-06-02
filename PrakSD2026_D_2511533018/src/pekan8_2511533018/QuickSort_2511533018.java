package pekan8_2511533018;

import pekan8_2511533018.Constants.Angka;
import pekan8_2511533018.Constants.Pesan;
import pekan8_2511533018.Utils.Utils;

public class QuickSort_2511533018 {
    // swap
    private static void swap_2511533018(int[] arr_3018, int i_3018, int j_3018) {
        int temp_3018 = arr_3018[i_3018];
        arr_3018[i_3018] = arr_3018[j_3018];
        arr_3018[j_3018] = temp_3018;
    }

    // median of three
    private static void medianofThree_2511533018(int[] arr_3018, int low_3018, int high_3018) {
        int mid_3018 = low_3018 + (high_3018 - low_3018) / Angka.DUA;

        if (arr_3018[low_3018] > arr_3018[mid_3018]) {
            swap_2511533018(arr_3018, low_3018, mid_3018);
        }

        if (arr_3018[low_3018] > arr_3018[high_3018]) {
            swap_2511533018(arr_3018, low_3018, high_3018);
        }

        if (arr_3018[mid_3018] > arr_3018[high_3018]) {
            swap_2511533018(arr_3018, mid_3018, high_3018);
        }

        swap_2511533018(arr_3018, mid_3018, high_3018);
    }

    // partition
    private static int partition_2511533018(int[] arr_3018, int low_3018, int high_3018) {
        medianofThree_2511533018(arr_3018, low_3018, high_3018);

        int pivot_3018 = arr_3018[high_3018];
        int i_3018 = (low_3018 - Angka.SATU);

        for (int j_3018 =  low_3018; j_3018 <= high_3018 - Angka.SATU; j_3018++) {
            if (arr_3018[j_3018] < pivot_3018) {
                i_3018++;
                swap_2511533018(arr_3018, i_3018, j_3018);
            }
        }

        swap_2511533018(arr_3018, i_3018 + Angka.SATU, high_3018);
        return (i_3018 + Angka.SATU);
    }

    // sort
    private static void quickSort_2511533018(int[] arr_3018, int l_3018, int h_3018) {
        if (l_3018 < h_3018) {
            int pi_3018 = partition_2511533018(arr_3018, l_3018, h_3018);
            quickSort_2511533018(arr_3018, l_3018, pi_3018 - Angka.SATU);
            quickSort_2511533018(arr_3018, pi_3018 + Angka.SATU, h_3018);
        }
    }

    // printer
    private static void printArray(int[] arr_3018) {
        for (int i_3018 = Angka.NOL; i_3018 < arr_3018.length; ++i_3018) {
            System.out.println(arr_3018[i_3018] + Pesan.ONE_SPACE);
        }
        Utils.printEmpty();
    }

    public static void main(String[] args) {
        int[] arr_3018 = { 10, 7, 8, 9, 1, 5 };
        int n_3018 = Utils.hitungPanjangArray(arr_3018);

        Utils.printString(Pesan.SEBELUM_TERURUT);
        Utils.printArray(arr_3018);

        quickSort_2511533018(arr_3018, Angka.NOL, n_3018 - Angka.SATU);

        Utils.printString(Pesan.SESUDAH_TERURUT);
        Utils.printArray(arr_3018);
    }
}
