package pekan7_2511533018;

public class BubbleSort_2511533018 {

    public static  void bubbleSort_2511533018(int[] arr_3018) {
        int n_3018 = arr_3018.length;

        for (int i = 0;  i < n_3018; i++) {
            for (int j = 0; j < n_3018 - i - 1; j++) {
                if (arr_3018[j] > arr_3018[j + 1]) {
                    int temp_3018 = arr_3018[j];
                    arr_3018[j] = arr_3018[j + 1];
                    arr_3018[j + 1] = temp_3018;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr_3018[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_3018 = arr_3018.length;

        System.out.printf("array yang belum terurut/n");
        for (int i = 0; i < n_3018; i++) {
            System.out.println(arr_3018[i] + " ");
        }
        System.out.println("");

        bubbleSort_2511533018(arr_3018);

        for (int i = 0; i < n_3018; i++)
        {
            System.out.println(arr_3018[i] + " ");
        }
        System.out.println("");
     }
}
