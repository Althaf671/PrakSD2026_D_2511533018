package pekan3_2511533018;

public class Siswa_2511533018 
{
	private String nama_3018;
	
	private int nim_3018;
	
	public Siswa_2511533018(String nama, int nim)
	{
		nama_3018 = nama;
		nim_3018 = nim;
	}
	
	@Override
	public String toString()
	{
		return "NIM " + nim_3018 + ", Nama: " + nama_3018;
	}
}
