package pekan1_2511533018;

public final class Jam_2511533018 {

	//========== Attributes ==========//
	private int HH;
	
	private int MM;
	
	private int SS;
	
	
	//========== Validator ==========//
	public static boolean IsValid(int h, int m, int s)
	{
		return (0 <= h && h <= 23)
				&& (0 <= m && m <= 59)
				&& (0 <= s && s <= 59);
	}
	
	
	//========== Constructor ==========//
	public Jam_2511533018(int h, int m, int s)
	{
		HH = h;
		MM = m;
		SS = s;
	}
	
	
	//========== Getter ==========//
	public int GetHour() 
	{
		return HH;
	}
	
	public int GetMinute()
	{
		return MM;
	}
	
	public int GetSecond()
	{
		return SS;
	}
	
	
	// Setter
	public void SetHour(int h)
	{
		HH = h;
	}
	
	public void SetMinute(int m)
	{
		MM = m;
	}
	
	public void SetSecond(int s)
	{
		SS = s;
	}
	
	
	//========== Konversi ==========//
	public int ToSeconds()
	{
		return HH * 3600 + MM * 60 + SS;
	}
	
	public static Jam_2511533018 FromSeconds(int total)
	{
		if (total < 0)
			throw new IllegalArgumentException("Detik Negatif");
		
		total %= 24 * 3600;
		
		int h = total / 3600;
		total %= 3600;
		
		int m = total / 60;
		int s = total % 60;
		
		return new Jam_2511533018(h, m, s);
	}
	
	
	// Relasional
	public int CompareTo(Jam_2511533018 other)
	{
		return Integer.compare(ToSeconds(), other.ToSeconds());
	}
	
	public boolean Equals(Object o)
	{
		if (!(o instanceof Jam_2511533018 j))
			return false;
		
		return HH == j.HH && MM == j.MM && SS == j.SS;
	}
	
	public int HashCode()
	{
		return java.util.Objects.hash(HH, MM, SS);
	}
	
	// ========== Aritmatika ==========//
	public Jam_2511533018 Plus(Jam_2511533018 other)
	{
		return FromSeconds(this.ToSeconds() + other.ToSeconds());
	}
	
	public Jam_2511533018 Minus(Jam_2511533018 other)
	{
		return FromSeconds(ToSeconds() + other.ToSeconds());
	}
	
	public Jam_2511533018 NextSecond()
	{
		return FromSeconds(ToSeconds() + 1);
	}
	
	public Jam_2511533018 NextNSecond(int n)
	{
		return FromSeconds(ToSeconds() + Math.max(0, n));
	}
	
	public Jam_2511533018 PrevSecond()
	{
		return FromSeconds(Math.floorMod(ToSeconds() - 1, 24 * 3600));
	}
	
	public Jam_2511533018 PrevNSecond(int n)
	{
		return FromSeconds(Math.floorMod(ToSeconds() - Math.max(0, n), 24 * 3600));
	}
	
	/**\
	 * Durasi (detik) 
	 * Bisa negatif jika this > other? 
	 * sesuai spesifikasi durasi (JAw, JAkh)
	 */
	public static int DurasiDetik(Jam_2511533018 jaw, Jam_2511533018 jakh)
	{
		return jakh.ToSeconds() - jaw.ToSeconds();
	}
	
	// overriding ke string
	public String ToString()
	{
		return String.format("%02d:%02d:%02d", HH, MM, SS);
	}
}
