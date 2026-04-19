package pekan3_2511533018;

public class Website_2511533018 
{
	public String Judul;
	
	public String Url;
	
	// -- setter --
	public void setJudul(String judul)
	{
		Judul = judul;
	}
	
	public void setUrl(String url)
	{
		Url = url;
	}
	
	// -- getter --
	public String getJudul()
	{
		return Judul;
	}
	
	public String getUrl()
	{
		return Url;
	}
	
	// -- constructor --
	public Website_2511533018(String judul, String url)
	{
		Judul = judul;
		Url = url;
	}
	
	@Override
	public String toString()
	{
		return "Judul: " + Judul + ", Url: " + Url;
	}
}
