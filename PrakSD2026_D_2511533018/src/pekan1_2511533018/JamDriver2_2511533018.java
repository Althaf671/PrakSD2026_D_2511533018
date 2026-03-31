package pekan1_2511533018;

import java.util.Scanner;

public class JamDriver2_2511533018 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("//===== Program Driver Objek Jam =====//");
		
		// 1. Input jam pertama
		System.out.println("\n--- Input Jam 1 ---");
		Jam_2511533018 j1 = BuatJamDariInput(input);
		
		// 2. Input jam kedua
		System.out.println("\n--- Input Jam 2 ---");
		Jam_2511533018 j2 = BuatJamDariInput(input);
		
		// 3. Menampilkan data
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("Jam 1 (String)		: " + j1.ToString());
		System.out.println("Jam 2 (String)		: " + j2.ToString());
		System.out.println("Jam 1 dalam detik	: " + j1.ToSeconds());
		System.out.println("Jam 2 dalam detik	: " + j2.ToSeconds());
		
		// 4. Operasi Relasional
		int perbandingan = j1.CompareTo(j2);
		if (perbandingan > 0)
		{
			System.out.println("Status			: Jam 1 lebih lambat (setelah) Jam 2");
		}
		else if (perbandingan < 0)
		{
			System.out.println("Status			: Jam 1 lebih awal (sebelum) Jam 2");
		}
		else
		{
			System.out.println("Status			: Jam 1 dan Jam 2 sama persis");
		}
		
		// 5. Operasi Aritmatika
		System.out.println(
			"Durasi (J1 ke J2)	: " 
			+ Jam_2511533018.DurasiDetik(j1, j2) 
			+ " detik"
		);
		
		Jam_2511533018 jNext = j1.NextSecond();
		System.out.println("Jam 1 Detik berikutnya	: " + jNext.ToString());
		
		Jam_2511533018 jPrev = j1.PrevSecond();
		System.out.println("Jam 1 Detik sebelumnya	: " + jPrev.ToString());
		
		// 6. Operasi Penjumlahan
		Jam_2511533018 jResPlus = j1.Plus(j2);
		System.out.println("Hasil J1 + J2		: " + jResPlus.ToString());
		
		input.close();
		
		System.out.println("\n--- Program Selesai ---");
	}

	// Create jam
	private static Jam_2511533018 BuatJamDariInput(Scanner input)
	{
		while (true)
		{
			System.out.println("Input jam (0-23): ");
			int h = input.nextInt();
			
			System.out.println("Input menit (0-59): ");
			int m = input.nextInt();
			
			System.out.println("Input detik (0-59): ");
			int s = input.nextInt();
			
			// Validator
			if (Jam_2511533018.IsValid(h, m, s))
			{
				return new Jam_2511533018(h, m, s);
			}
			else
			{
				System.out.println("[ERROR] Input tidak valid! ulangi lagi! \n");
			}
			
		}
	}
}
