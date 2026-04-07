package pekan2_2511533018;

public class DaftarKataDriver_2511533018 {

	public static void main(String[] args) {
		
		DaftarKata_2511533018 dk = new DaftarKata_2511533018();
		
		// tambah elemen (akhir)
		dk.tambah_2511533018("Kami");
		dk.tambah_2511533018("Informatika");
		
		// Menyisipkan elemen pada index
		dk.tambahPada_2511533018(1, "Mahasiswa");
		
		// cetak isi awal
		System.out.println("Awal				: " + dk);
		
		// mengubah elemen index 1
		dk.ubahElemen_2511533018(1, "Departemen");
		System.out.println("Setelah Ubah: " + dk);
		
		// menghapus elemen (hapus idx 0)
		String terhapus = dk.hapusElemen_2511533018(0);
		System.out.println("Terhapus			: " + terhapus);	
		System.out.println("Setelah Terhapus	: " + dk);
		
		// iterasi pada array list (cetak setiap elemen)
		System.out.println("Iterasi");
		dk.iterasiCetak();
		System.out.println("Selesai");
	}

}
