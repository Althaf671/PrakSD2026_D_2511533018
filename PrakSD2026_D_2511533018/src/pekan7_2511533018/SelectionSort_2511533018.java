package pekan7_2511533018;

public class SelectionSort_2511533018 {

    public static void selectionSort_2511533018(int[] arr_3018)
    {
        int n_3018 = arr_3018.length;
        for (int i = 0; i < n_3018; i++)
        {
            int minIndex_3018 = i;
            for (int j = i + 1; j < n_3018; j++)
            {
                if (arr_3018[j] < arr_3018[minIndex_3018])
                {
                    minIndex_3018 = j;
                }
            }

            int temp_3018 = arr_3018[i];
            arr_3018[i] =  arr_3018[minIndex_3018];
            arr_3018[minIndex_3018] =  temp_3018;
        }
    }

    public static void main(String[] args)
    {
        int arr_3018[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_3018 = arr_3018.length;

        System.out.printf("array yang belum terurut:\n");
        for (int i = 0; i < n_3018; i++)
        {
            System.out.print(arr_3018[i] + " ");
        }
        System.out.println("");

        selectionSort_2511533018(arr_3018);

        System.out.println("array yang terurut:\n");

        for (int i = 0; i < n_3018; i++)
        {
            System.out.println(arr_3018[i] + " ");
        }
        System.out.println("");

    }
}
