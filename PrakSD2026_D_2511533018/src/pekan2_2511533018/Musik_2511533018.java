package pekan2_2511533018;

public class Musik_2511533018 
{
	// 1000% Althaf buat - karena makai Allman brace style
	public String JudulLagu;
	
	public String Penyanyi;
	
	public double Durasi;
	
	// -- setter --
	public void setJudulLagu(String jl) 
	{
		JudulLagu = jl;
	}
	
	public void setPenyanyi(String p)
	{
		Penyanyi = p;
	}
	
	public void setDurasi(double d)
	{
		Durasi = d;
	}
	
	// -- getter --
	public String getJudulLagu()
	{
		return JudulLagu;
	}
	
	public String getPenyanyi()
	{
		return Penyanyi;
	}
	
	public double getDurasi()
	{
		return Durasi;
	}
	
	// -- constructor
	public Musik_2511533018(
		String judulLagu,
		String penyanyi,
		double durasi) 
	{
		JudulLagu = judulLagu;
		Penyanyi = penyanyi;
		Durasi = durasi;
	}
	
	@Override
	public String toString() 
	{
		return "Judul Lagu: " + JudulLagu + ", Penyanyi: " + Penyanyi + ", Durasi: " + Durasi;
	}
}
