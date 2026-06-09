package pekan8_2511533018.Utils;

import pekan8_2511533018.Constants.Angka;
import pekan8_2511533018.Constants.Pesan;

public class Utils {
    public static void printArray(int[] arr) {
        int panjangArray = arr.length;
        for (int i = Angka.NOL; i < panjangArray; ++i) {
            System.out.println(arr[i] + Pesan.ONE_SPACE);
        }
        System.out.println();
    }

    public static void printLineStatement(String statement) {
        System.out.println(statement);
    }

    public static void printLineStatement() {
        printLineStatement("");
    }

    public static  void printLineStatement(int val) { System.out.println(val); }

    public static int hitungPanjangArray(int[] arr) {
        return arr.length;
    }

    public static void printStatement(String statement) { System.out.print(statement); }
}
