package pekan2_2511533018;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511533018 {

	public static void tampilkanMenu_2511533018() 
	{
		System.out.println("\nMenuL");
		System.out.println("1. Tambah mahasiswa ");
		System.out.println("2. Tampilkan semua mahasiswa");
		System.out.println("3. Hapus mahasiswa berdasarkan NIM");
		System.out.println("4. Cari mahasiswa berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	
	public static void tambahMahasiswa_2511533018(ArrayList<Mahasiswa_2511533018> msList, Scanner sc)
	{
		System.out.println("Masukan NIM: ");
		String nim = sc.nextLine();
		
		System.out.println("Masukan Nama: ");
		String nama = sc.nextLine();
		
		System.out.println("Masukan Prodi");
		String prodi = sc.nextLine();
		
		msList.add(new Mahasiswa_2511533018(nim, nama, prodi));
		System.out.println("Sukses menambahkan mahasiswa.");
	}
	
	public static void tampilkanSemuaMahasiswa_2511533018(ArrayList<Mahasiswa_2511533018> msList)
	{
		if (msList.isEmpty())
		{
			System.out.println("Daftar mahasiswa kosong.");
		}
		else
		{
			System.out.println("Data mahasiswa: ");
			for (Mahasiswa_2511533018 ms : msList)
				System.out.println(ms);
				
		}
	}
	
	public static void hapusMahasiswa_2511533018(ArrayList<Mahasiswa_2511533018> msList, Scanner sc)
	{
		System.out.print("Masukan NIM yang akan dihapus: ");
		String nimHapus = sc.nextLine();
		
		boolean isRemoved = msList.removeIf(mhs -> mhs.Nim.equals(nimHapus));
		
		if (isRemoved)
		{
			System.out.println("Data dengan NIM " + nimHapus + " berhasil dihapus");
		}
		else 
		{
			System.out.println("NIM tidak ditemukan.");
		}
	}
	
	public static void cariMahasiswa_2511533018(ArrayList<Mahasiswa_2511533018> msList, Scanner sc)
	{
		System.out.println("Masukan NIM yang dicari: ");
		String nimCari = sc.nextLine();
		
		boolean isDitemukan = false;
		
		for (Mahasiswa_2511533018 mhs : msList)
		{
			if (mhs.Nim.equals(nimCari))
			{
				System.out.println("Hasil pencarian: " + mhs);
				isDitemukan = true;
				return;
			}
			
			if (!isDitemukan)
			{
				System.out.println("NIM tidak ada.");
			}
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList<Mahasiswa_2511533018> msList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		do {
			tampilkanMenu_2511533018();
			System.out.println("Pilih menu: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice)
			{
				case 1:
					tambahMahasiswa_2511533018(msList, sc);
					break;
				case 2:
					tampilkanSemuaMahasiswa_2511533018(msList);
					break;
				case 3:
					hapusMahasiswa_2511533018(msList, sc);
					break;
				case 4:
					cariMahasiswa_2511533018(msList, sc);
					break;
			}
		}
		while (choice != 5);
		
		sc.close();
	}
}
