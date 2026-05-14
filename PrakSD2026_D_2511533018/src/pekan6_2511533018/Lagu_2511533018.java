package pekan6_2511533018;

public class Lagu_2511533018 
{
    private String judul_3018;
    private String penyanyi_3018;
    Lagu_2511533018 next_3018;
    Lagu_2511533018 prev_3018;

    // Constructor 
    public Lagu_2511533018(String judul, String penyanyi) 
    {
        this.judul_3018 = judul;
        this.penyanyi_3018 = penyanyi;
        this.next_3018 = null;
        this.prev_3018 = null;
    }

    // Getter dan Setter 
    public String getJudul_3018() 
    { 
    	return judul_3018; 
    }
    
    public void setJudul_3018(String judul) 
    { 
    	this.judul_3018 = judul; 
    }
    
    public String getPenyanyi_3018() 
    { 
    	return penyanyi_3018; 
    }
    
    public void setPenyanyi_3018(String penyanyi) 
    { 
    	this.penyanyi_3018 = penyanyi; 
    }
}