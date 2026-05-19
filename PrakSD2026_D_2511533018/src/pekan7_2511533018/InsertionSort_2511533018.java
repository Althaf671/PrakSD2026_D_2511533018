package pekan7_2511533018;

public class InsertionSort_2511533018 {

	public static void insertionSort_2511533018(int[] arr_3018)
	{
		int n_3018 = arr_3018.length;

		for (int i = 1 ; i < n_3018; i++)
		{
			int key_3018 = arr_3018[i];
			int j_3018 = i - 1;

			while (j_3018 >= 0 && arr_3018[j_3018] > key_3018)
			{
				arr_3018[j_3018 + 1] = arr_3018[j_3018];
				j_3018--;
			}
			arr_3018[j_3018 + 1] = key_3018;
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

		insertionSort_2511533018(arr_3018);

		System.out.println("array yang terurut:\n");

		for (int i = 0; i < n_3018; i++)
		{
			System.out.println(arr_3018[i] + " ");
		}
		System.out.println("");
	}

}
