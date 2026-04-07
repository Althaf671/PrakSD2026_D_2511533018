package pekan2_2511533018;

import java.util.ArrayList;

public class DaftarKata_2511533018 {
	
	private final ArrayList<String> data;

	public DaftarKata_2511533018()
	{
		data = new ArrayList<>();
	}
	
	// Menambah elemen di akhir list
	public void tambah_2511533018(String el)
	{
		data.add(el);
	}
	
	// Menambah elemen pada indexs tertentu 
	public void tambahPada_2511533018(int idx, String el)
	{
		data.add(idx, el);
	}
	
	/**
	 * Mengubah elemen pada posisi 'index' menjadi 'nilaiBaru',
	 * Bertindak sebagai 'setter' untuk elemen tertentu.
	 */
	public void ubahElemen_2511533018(int idx, String nilaiBaru)
	{
		data.set(idx, nilaiBaru);
	}
	
	// Menghapus elemen pada posisi 'index' dan mengembalikam nilai yang dihapus.
	public String hapusElemen_2511533018(int idx)
	{
		return data.remove(idx);
	}
	
	/**
	 * Melakukan iterasi dan memetak setiap elemen dalam format: [index] nilai
	 * (Metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi).
	 */
	public void iterasiCetak()
	{
		for (int i = 0; i < data.size(); i++)
			System.out.println(data.get(i) + " ");
	}
	
	// Mengambil elemen berdasarkan indeks
	public String get(int idx) 
	{
		return data.get(idx);
	}
	
	// Representasi string agar mudah dicetak
	@Override
	public String toString()
	{
		return data.toString();
	}
}












