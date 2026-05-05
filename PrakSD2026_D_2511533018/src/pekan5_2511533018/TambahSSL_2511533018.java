package pekan5_2511533018;

public class TambahSSL_2511533018 
{
	public static NodeSSL_2511533018 insertAtFront_2511533018(
		NodeSSL_2511533018 head,
		int value)
	{
		NodeSSL_2511533018 new_node_3018 = new NodeSSL_2511533018(value);
		new_node_3018.next_3018 = head;
		return new_node_3018;
	}
	
	// -- Fungsi menambahkan node di akhir SLL
	public static NodeSSL_2511533018 insertAtEnd_2511533018(NodeSSL_2511533018 head, int value)
	{
		// Buat sebuah node dengan nilai 
		NodeSSL_2511533018 new_node_3018 = new NodeSSL_2511533018(value);
		
		// Jika list kosong maka node jadi head
		if (head == null)
			return new_node_3018;
		
		// Simpan head ke variabel sementara
		NodeSSL_2511533018 last_3018 = head;
		
		// Telusuri ke node akhir
		while (last_3018.next_3018 != null)
		{
			last_3018 = last_3018.next_3018;
		}
		
		// Ubah pointer
		last_3018.next_3018 = new_node_3018;
		return head;
	}
	
	public static NodeSSL_2511533018 getNode_2511533018(int data)
	{
		return new NodeSSL_2511533018(data);
	}
	
	public static NodeSSL_2511533018 insertPos_2511533018(
			NodeSSL_2511533018 headNode, 
			int position, 
			int value)
	{
		NodeSSL_2511533018 head_3018 = headNode;
		
		if (position < 1)
			System.out.println("Invalid Position");
		
		if (position == 1)
		{
			NodeSSL_2511533018 new_node_3018 = new NodeSSL_2511533018(value);
			new_node_3018.next_3018 = head_3018;
			return new_node_3018;
		}
		else
		{
			while (position-- != 0)
			{
				if (position == 1)
				{
					NodeSSL_2511533018 new_node_3018 = getNode_2511533018(value);
					new_node_3018.next_3018 = headNode.next_3018;
					headNode.next_3018 = new_node_3018;
					break;
				}
			}
			headNode = headNode.next_3018;
		}
		
		if (position != 1)
			System.out.println("Posisi di luar jangkauan.");
			
		return head_3018;
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
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		// buat linked list 2 -> 3 -> 5 -> 6
		NodeSSL_2511533018 head_3018 = new NodeSSL_2511533018(2);
		
		head_3018.next_3018 = new NodeSSL_2511533018(3);
		
		head_3018.next_3018.next_3018 = new NodeSSL_2511533018(5);
		
		// cetak list asli
		System.out.println("Tambah 1 simpul di depan: ");
		
		int data_3018 = 1;
		
		printList_2511533018(head_3018);
		
		// tambahkan node baru di belakang
		System.out.println("tambah 1 simpul di belakang: ");
		
		int data2_3018 = 7;
		head_3018 = insertAtEnd_2511533018(head_3018, data2_3018);
		
		// cetak update list
		printList_2511533018(head_3018);
		
		System.out.println("tambah 1 simpul ke data 4: ");
		
		int data3_3018 = 4;
		int pos_3018 = 4;
		
		head_3018 = insertPos_2511533018(head_3018, pos_3018, data3_3018);
		
		// cetak update list
		printList_2511533018(head_3018);
	}
}
