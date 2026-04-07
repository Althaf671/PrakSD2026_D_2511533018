package pekan2_2511533018;

public class Mahasiswa_2511533018 {
	
	String Nim;
	
	String Nama;
	
	String Prodi;
	
	public Mahasiswa_2511533018(String nim, String nama, String prodi)
	{
		Nim = nim;
		Nama = nama;
		Prodi = prodi;
	}
	
	@Override
	public String toString()
	{
		return "NIM " + Nim + ", Nama: " + Nama + ", Prodi: " + Prodi;
	}
}
