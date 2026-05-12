package pekan6_2511533018;

public class PenelusuranDLL_2511533018 
{
    public static void forwardTraversal_2511533018(NodeDLL_2511533018 head_3018)
    {
        NodeDLL_2511533018 curr_3018 = head_3018;

        while (curr_3018 != null) 
        {
            System.out.print(curr_3018.data_3018 + " <-> ");
            curr_3018 = curr_3018.next_3018;    
        }

        System.out.println();
    }  
    
    public static void backwardTraversal(NodeDLL_2511533018 tail)
    {
        NodeDLL_2511533018 curr_3018 = tail;
        while (curr_3018 != null) 
        {
            System.out.print(curr_3018.data_3018 + " <-> ");
            curr_3018 = curr_3018.prev_3018 ;   
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeDLL_2511533018 head_3018_3018 = new NodeDLL_2511533018(1);
        NodeDLL_2511533018 second_3018 = new NodeDLL_2511533018(2);
        NodeDLL_2511533018 third_3018 = new NodeDLL_2511533018(3);

        head_3018_3018.next_3018 = second_3018;
        second_3018.prev_3018 = head_3018_3018;
        second_3018.next_3018 = third_3018;
        third_3018.prev_3018 = second_3018;

        System.out.println("Penelusuran maju: ");
        forwardTraversal_2511533018(head_3018_3018);

        System.out.println("Penelusuran mundur: ");
        backwardTraversal(third_3018);
    }
}


