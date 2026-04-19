package pekan2_2511533018;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533018 
{
	private ArrayList<Musik_2511533018> playlist_3018 = new ArrayList<>();
	private static final int maxkapasitas_3018 = 10;
	
	public Playlist_2511533018 () {}
	
	private void menu_2511533018(Scanner input)
	{
		while (true) {
			System.out.println("\n--- PROGRAM PLAYLIST DAN LAGU 2511533018 ---");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Lihat Playlist");
			System.out.println("3. Hapus Lagu");
			System.out.println("4. Cek Kapasitas");
			System.out.println("5. Keluar");
			
			System.out.print("Masukan pilihan (1-5): ");
			int pilihan_3018 = input.nextInt();
			input.nextLine();
			
			if (pilihan_3018 == 5) break;

			switch (pilihan_3018)
			{
				case 1:
					 tambahLagu_2511533018(input);
					 break;
				case 2:
					lihatPlaylist_2511533018();
					break;
				case 3:
					hapusLagu_2511533018(input);
					break;
				case 4:
					cekKapasitas_2511533018(input);
					break;
				default:
					System.out.println("Pilihan tidak valid.");
			}
		}
	}
	
	private void tambahLagu_2511533018(Scanner input) 
	{
		if (playlist_3018.size() >= maxkapasitas_3018) {
			System.out.println("Playlist telah penuh");
			return;
		}
		
		System.out.print("Masukan judul lagu: " );
		String judulLagu_3018 = input.nextLine();
		
		System.out.print("Masukan penyanyi: " );
		String penyanyi_3018 = input.nextLine();
		
		System.out.print("Masukan durasi: " );
		double durasi_3018 = input.nextDouble();
		
		playlist_3018.add(new Musik_2511533018(judulLagu_3018, penyanyi_3018, durasi_3018));
	}
	
	private void lihatPlaylist_2511533018()
	{
		if (playlist_3018.isEmpty()) {
			System.out.println("Playlist kosong.");
			return;
		}
		
		System.out.println("Data playlist: " );
		for (int i = 0; i < playlist_3018.size(); i++)
		{
			System.out.println(i + ". " + playlist_3018.get(i));
		}
	}
	
	private void hapusLagu_2511533018(Scanner input)
	{
		if (playlist_3018.isEmpty()) {
			System.out.println("Playlist kosong, tidak ada yang bisa dihapus.");
			return;
		}
		System.out.print("Pilih nomor lagu yang mau dihapus: ");
		int pilihan_3018 = input.nextInt();
		input.nextLine();
		
		if (pilihan_3018 >= 0 && pilihan_3018 < playlist_3018.size()) {
			playlist_3018.remove(pilihan_3018);
			System.out.println("Lagu berhasil dihapus.");
		} else {
			System.out.println("Indeks tidak valid.");
		}
	}
	
	private void cekKapasitas_2511533018(Scanner input)
	{
		System.out.println("Kapasitas terisi Playlist adalah: " + playlist_3018.size() + " dari " + maxkapasitas_3018);
		System.out.println("Kapasitas max Playlist adalah: " + maxkapasitas_3018);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Playlist_2511533018 app = new Playlist_2511533018();
		app.menu_2511533018(input);
		input.close();
	}
}
