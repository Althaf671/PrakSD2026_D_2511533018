package pekan6_2511533018;

public class InsertDLL_2511533018
{
    public static NodeDLL_2511533018 insertBegin_2511533018(
        NodeDLL_2511533018 head_3018,
        int data)
    {
        NodeDLL_2511533018 new_node_3018 = new NodeDLL_2511533018(data);

        new_node_3018.next_3018 = head_3018;

        if (head_3018 != null)
        {
            head_3018.prev_3018 = new_node_3018;
        }

        return new_node_3018;
    }

    public static NodeDLL_2511533018 insertEnd_2511533018(
        NodeDLL_2511533018 head_3018,
        int newData)
    {
        NodeDLL_2511533018 new_node_3018 = new NodeDLL_2511533018(newData);

        if (head_3018 == null)
        {
            head_3018 = new_node_3018;
        }
        else 
        {
            NodeDLL_2511533018 curr_3018 = head_3018;
            while (curr_3018.next_3018 != null)
            {
                curr_3018 = curr_3018.next_3018;
            }
            curr_3018.next_3018 = new_node_3018;
            new_node_3018.prev_3018 = curr_3018;
        }
        return head_3018;
    }

    public static NodeDLL_2511533018 insertAtPosition(
        NodeDLL_2511533018 head_3018,
        int pos,
        int new_data)
    {
        NodeDLL_2511533018 new_node_3018 = new NodeDLL_2511533018(new_data);

        if (pos == 1)
        {
            new_node_3018.next_3018 = head_3018;
            if (head_3018 != null)
            {
                head_3018.prev_3018 = new_node_3018;
            }
            head_3018 = new_node_3018;
            return head_3018;
        }

        NodeDLL_2511533018 curr_3018 = head_3018;

        for (int i = 1; i < pos - 1&& curr_3018 != null; i++)
        {
            curr_3018 = curr_3018.next_3018; 
        }

        if (curr_3018 == null)
        {
            System.out.println("Posisi tidak ada.");
            return head_3018;
        }

        new_node_3018 .prev_3018 = curr_3018;
        new_node_3018.next_3018 = curr_3018.next_3018;
        curr_3018.next_3018 = new_node_3018;

        if (new_node_3018.next_3018 != null)
        {
            new_node_3018.next_3018.prev_3018 = new_node_3018;
        }

        return head_3018;
    }

    public static void printList_2511533018(NodeDLL_2511533018 head_3018)
    {
        NodeDLL_2511533018 curr_3018 = head_3018;

        while (curr_3018 != null)
        {
            System.out.print(curr_3018.data_3018 + " <-> ");
            curr_3018 = curr_3018.next_3018;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        NodeDLL_2511533018 head_3018_3018 = new NodeDLL_2511533018(2);
        head_3018_3018.next_3018 = new NodeDLL_2511533018(3);
        head_3018_3018.next_3018.prev_3018 = head_3018_3018;
        head_3018_3018.next_3018.next_3018 = new NodeDLL_2511533018(5);
        head_3018_3018.next_3018.next_3018.prev_3018 = head_3018_3018;

        System.out.print("DLL Awal: ");
        printList_2511533018(head_3018_3018);

        head_3018_3018 = insertBegin_2511533018(head_3018_3018, 1);
        System.out.print("Simpul 1 ditambah di awal: ");
        printList_2511533018(head_3018_3018);

        System.out.print("Simpul 6 ditambah di akhir: ");
        int data_3018 = 6;
        head_3018_3018 = insertEnd_2511533018(head_3018_3018, data_3018);
        printList_2511533018(head_3018_3018);

        System.out.print("Tambah node 4 di posisi 4: ");
        int data2_3018 = 4;
        int pos_3018 = 4;
        head_3018_3018 = insertAtPosition(head_3018_3018, pos_3018, data2_3018);
        printList_2511533018(head_3018_3018);
    }
}

