package pekan5_2511533018;

public class Pasien_2511533018 
{
    private String namaPasien_3018;
    private String penyakit_3018;
    private int nomorAntrian_3018;
    public Pasien_2511533018 next_3018; 

    public Pasien_2511533018(String nama, String keluhan, int nomor) 
    {
        this.namaPasien_3018 = nama;
        this.penyakit_3018 = keluhan;
        this.nomorAntrian_3018 = nomor;
        this.next_3018 = null;
    }

    public String getNama_3018() 
    { 
    	return namaPasien_3018; 
    }
    
    public String getPenyakit_3018() 
    { 
    	return penyakit_3018; 
    }
    
    public int getNomor_3018() 
    { 
    	return nomorAntrian_3018; 
    }
}