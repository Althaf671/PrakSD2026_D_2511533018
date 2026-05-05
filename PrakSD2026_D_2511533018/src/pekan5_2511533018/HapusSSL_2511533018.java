package pekan5_2511533018;

public class HapusSSL_2511533018 
{
	public static NodeSSL_2511533018 deleteHead_2511533018(NodeSSL_2511533018 head)
	{
		// jika SSL kosong
		if (head == null)
			return null;
		
		// pindahkan head ke node berikutnya
		head = head.next_3018;
		
		// return head baru
		return head;
	}
	
	// fungsu mennghapus node terakhir SSL
	public static NodeSSL_2511533018 removeLastNode_2511533018(NodeSSL_2511533018 head)
	{
		// jika list kosong, return null
		if (head == null)
			return null;
		
		if (head.next_3018 == null)
			return null;
		
		// temukan node terakhir ke dua
		NodeSSL_2511533018 secondLast_3018 = head;
		while (secondLast_3018.next_3018.next_3018 != null) {
			secondLast_3018 = secondLast_3018.next_3018;
		}
		
		// hapus node terakhir
		secondLast_3018.next_3018 = null;
		return head;
	}
	
	// fungsi mengapus node di posisi tertentu
	public static NodeSSL_2511533018 deleteNode_2511533018(NodeSSL_2511533018 head, int position)
	{
		NodeSSL_2511533018 temp_3018 = head;
		NodeSSL_2511533018 prev_3018 = null;
		
		// jika linked list null
		if (temp_3018 == null)
			return head;
		
		if (position == 1)
		{
			head = temp_3018.next_3018;
			return head;
		}
		
		// kasus 2: menghapus node di tngah
		// telusuri ke node yang dihapus
		for (int i = 1; temp_3018 != null && i < position; i++)
		{
			prev_3018 = temp_3018;
			temp_3018 = temp_3018.next_3018;
		}
		
		// jika ditemukan, hapus node
		if (temp_3018 != null)
		{
			prev_3018.next_3018 = temp_3018.next_3018;
		}
		else
		{
			System.out.println("Data tidak ada.");
		}
		
		return head;
	}
	
	public static void printList_2511533018(NodeSSL_2511533018 head)
	{
		NodeSSL_2511533018 curr_3018 = head;
		
		while (curr_3018.next_3018 != null)
		{
			System.out.print(curr_3018.data_3018 + "-->");
			curr_3018 = curr_3018.next_3018;
		}
		
		if (curr_3018.next_3018 == null)
		{
			System.out.print(curr_3018.data_3018);
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		NodeSSL_2511533018 head_3018 = new NodeSSL_2511533018(1);
		head_3018.next_3018 = new NodeSSL_2511533018(2);
		head_3018.next_3018.next_3018 = new NodeSSL_2511533018(3);
		head_3018.next_3018.next_3018.next_3018 = new NodeSSL_2511533018(4);
		head_3018.next_3018.next_3018.next_3018.next_3018 = new NodeSSL_2511533018(5);
		head_3018.next_3018.next_3018.next_3018.next_3018.next_3018 = new NodeSSL_2511533018(5);
		head_3018.next_3018.next_3018.next_3018.next_3018.next_3018.next_3018 = new NodeSSL_2511533018(6);
		
		// cetak list awal
		System.out.println("list awal: ");
		printList_2511533018(head_3018);
		
		// hapus head
		head_3018 = deleteHead_2511533018(head_3018);
		System.out.println("List setelah head dihapus: ");
		printList_2511533018(head_3018);
		
		// hapus node terakhir
		head_3018 = removeLastNode_2511533018(head_3018);
		System.out.println("List setelah simpul terakhir dihapus: ");
		printList_2511533018(head_3018);
		
		int p = 2;
		head_3018 = deleteNode_2511533018(head_3018, p);
		System.out.println("List setelah posisi 2 blkng dihapus: ");
		printList_2511533018(head_3018);
	}
}
