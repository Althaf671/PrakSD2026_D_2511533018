package pekan6_2511533018;

public class HapusDLL_2511533018 {
    
    public static NodeDLL_2511533018 deleteHead_2511533018(NodeDLL_2511533018 head_3018)
    {
        if (head_3018 == null)
        {
            return null;
        }

        head_3018 = head_3018.next_3018;

        if (head_3018 != null)
        {
            head_3018.prev_3018 = null;
        }

        return head_3018;
    }

    public static NodeDLL_2511533018 deleteLast_2511533018(NodeDLL_2511533018 head_3018)
    {
        if (head_3018 == null)
        {
            return null;
        }

        if (head_3018.next_3018 == null)
        {
            return null;
        }

        NodeDLL_2511533018 curr_3018 = head_3018;
        while (curr_3018.next_3018 != null) 
        {
            curr_3018 = curr_3018.next_3018;    
        }

        if (curr_3018.prev_3018 != null)
        {
            curr_3018.prev_3018.next_3018 = null;
        }

        return head_3018;
    }

    public static NodeDLL_2511533018 deletePos_2511533018(NodeDLL_2511533018 head_3018, int pos_3018)
    {
        if (head_3018 == null)
        {
            return head_3018;
        }

        NodeDLL_2511533018 curr_3018 = head_3018;
        
        // 1 -> i
        for (int i = 1; curr_3018 != null && i < pos_3018; i++)
        {
            curr_3018 = curr_3018.next_3018;
        }

        if (curr_3018 == null)
        {
            return head_3018;
        }

        if (curr_3018.prev_3018 != null)
        {
            curr_3018.prev_3018.next_3018 = curr_3018.next_3018;
        }

        if (curr_3018.next_3018 != null)
        {
            curr_3018.next_3018.prev_3018 = head_3018;
        }

        if (head_3018 == curr_3018)
        {
            head_3018 = curr_3018.next_3018;
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
        NodeDLL_2511533018 head_3018 = new NodeDLL_2511533018(1);
        head_3018.next_3018 = new NodeDLL_2511533018(2);
        head_3018.next_3018.prev_3018 = head_3018;
        head_3018.next_3018.next_3018 = new NodeDLL_2511533018(3);

        head_3018.next_3018.next_3018.prev_3018 = head_3018.next_3018;
        head_3018.next_3018.next_3018.next_3018 = new NodeDLL_2511533018(4);
        head_3018.next_3018.next_3018.next_3018.prev_3018 = head_3018.next_3018.next_3018;
        head_3018.next_3018.next_3018.next_3018.next_3018 = new NodeDLL_2511533018(5);
        head_3018.next_3018.next_3018.next_3018.next_3018.prev_3018 = head_3018.next_3018.next_3018.next_3018;

        System.out.print("DLL Awal: ");
        printList_2511533018(head_3018);

        System.out.print("Setelah head dihapus: ");
        head_3018 = deleteHead_2511533018(head_3018);
        printList_2511533018(head_3018);

        System.out.print("Setelah node terakhir dihapus: ");
        head_3018 = deleteLast_2511533018(head_3018);
        printList_2511533018(head_3018);

        System.out.print("Menghapus node ke 2: ");
        head_3018 = deletePos_2511533018(head_3018, 2);
        printList_2511533018(head_3018);
    }
}
