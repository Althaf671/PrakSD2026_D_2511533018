package pekan1_2511533018;

public class JamDriver_2511533018 {

	public static void main(String[] args) {
		Jam_2511533018 a = new Jam_2511533018(23, 59, 50);
		Jam_2511533018 b = new Jam_2511533018(0, 0, 15);
		
		System.out.println("a			= " + a.ToString());
		System.out.println("b			= " + b.ToString());
		System.out.println("a + b			= " + a.Plus(b).ToString());
		System.out.println("next 20s		= " + a.NextNSecond(20).ToString());
		System.out.println("durasi (a, b)		= " + Jam_2511533018.DurasiDetik(a, b));
		System.out.println("a.CompareTo		= " + a.CompareTo(b));
	}

}
