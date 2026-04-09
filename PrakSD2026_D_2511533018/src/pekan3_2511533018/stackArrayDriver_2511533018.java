package pekan3_2511533018;

public class stackArrayDriver_2511533018 {

	public static void main(String[] args) 
	{
		stackArray_2511533018 s = new stackArray_2511533018();
		
		s.push_2511533018(10);
		s.push_2511533018(20);
		s.push_2511533018(30);
		
		System.out.println(s.pop_2511533018() + " dikeluarkan dari stack.");
		System.out.println("Elemen teratas adalah :" + s.peek_2511533018());
		System.out.println("Element pada stack: ");
		s.print_2511533018();
	}

}
