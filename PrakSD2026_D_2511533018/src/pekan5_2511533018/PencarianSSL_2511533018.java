package pekan5_2511533018;

public class PencarianSSL_2511533018 
{
	public static boolean searchKey_2511533018(NodeSSL_2511533018 head, int key)
	{
		NodeSSL_2511533018 curr_3018 = head;
		
		while (curr_3018 != null)
		{
			if (curr_3018.data_3018 == key)
				return true;
			curr_3018 = curr_3018.next_3018;
		}
		
		return false;
	}
	
	public static void traversal_2511533018(NodeSSL_2511533018 head)
	{
		// mulai dari head
		NodeSSL_2511533018 curr_3018 = head;
		
		// telusuri sampai pointer null
		while (curr_3018 != null)
		{
			System.out.print(" " + curr_3018.data_3018);
			curr_3018 = curr_3018.next_3018;
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		NodeSSL_2511533018 head_3018 = new NodeSSL_2511533018(14);
		head_3018.next_3018 = new NodeSSL_2511533018(21);
		head_3018.next_3018.next_3018 = new NodeSSL_2511533018(13);
		head_3018.next_3018.next_3018.next_3018 = new NodeSSL_2511533018(30);
		head_3018.next_3018.next_3018.next_3018.next_3018 = new NodeSSL_2511533018(10);
		System.out.println("Penelusuran SLL: ");
		
		traversal_2511533018(head_3018);
		
		int key_3018 = 30;
		System.out.print("cari data " + key_3018 + " = ");
		if (searchKey_2511533018(head_3018, key_3018))
			System.out.print("ketemu");
		else
			System.out.print("tidak ada");
	}
}
