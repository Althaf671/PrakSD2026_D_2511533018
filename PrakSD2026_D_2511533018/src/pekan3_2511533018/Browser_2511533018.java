package pekan3_2511533018;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533018 
{
	private Stack<Website_2511533018> stack_3018 = new Stack<>();
	
	public Browser_2511533018() {}
	
	private void menu_2511533018(Scanner input)
	{
		int pilihan_3018 = 0;
		do {
			System.out.println("\n=== Browser History NIM: 2511533018 ===");
			System.out.println("1. Kunjungi Website (Push)");
			System.out.println("2. Tombol Back (Pop)");
			System.out.println("3. Lihat Halaman Aktif (Peek)");
			System.out.println("4. Cek Status History");
			System.out.println("5. Keluar");
			System.out.print("Pilihan: ");
			
			pilihan_3018 = input.nextInt();
			input.nextLine(); 
			
			switch(pilihan_3018) 
			{
				case 1: 
					kunjungiWebsite_2511533018(input); 
					break;
				case 2: 
					tombolBack_2511533018(input); 
					break;
				case 3: 
					lihatHalamanSaatIni_2511533018(input); 
					break;
				case 4: 
					cekStatusHistory_2511533018(input); 
					break;
				case 5: 
					System.out.println("Keluar program..."); 
					break;
				default: 
					System.out.println("Pilihan tidak valid!");
			}
		} while (pilihan_3018 != 5);
	}
	
	private void kunjungiWebsite_2511533018(Scanner input)
	{
		System.out.print("Masukan Judul: ");
		String judul_3018 = input.nextLine();
	
		System.out.print("Masukan URL: ");
		String url_3018 = input.nextLine();
		
		stack_3018.push(new Website_2511533018(judul_3018, url_3018));
		System.out.println("Berhasil mengunjungi halaman!");
	}
	
	private void tombolBack_2511533018(Scanner input)
	{
		if (!stack_3018.isEmpty()) {
			Website_2511533018 hapus_3018 = stack_3018.pop();
			System.out.println("Berhasil kembali dari: " + hapus_3018.getJudul());
		} 
		else 
		{
			System.out.println("Gagal Back, Riwayat kosong.");
		}
	}
	
	private void lihatHalamanSaatIni_2511533018(Scanner input)
	{
		if (!stack_3018.isEmpty()) 
		{
			System.out.println("Halaman Aktif: " + stack_3018.peek().getJudul());
			System.out.println("URL: " + stack_3018.peek().getUrl());
		} 
		else 
		{
			System.out.println("Tidak ada halaman yang aktif.");
		}
	}
	
	private void cekStatusHistory_2511533018(Scanner input)
	{
		if (stack_3018.isEmpty()) {
			System.out.println("Status: Riwayat kosong.");
		} 
		else 
		{
			System.out.println("Total riwayat: " + stack_3018.size() + " halaman.");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Browser_2511533018 bwsr_3018 = new Browser_2511533018();
		bwsr_3018.menu_2511533018(input);
		input.close();
	}
}
