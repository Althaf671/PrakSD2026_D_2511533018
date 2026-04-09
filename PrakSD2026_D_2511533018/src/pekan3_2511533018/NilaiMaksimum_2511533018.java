package pekan3_2511533018;

import java.util.Stack;

public class NilaiMaksimum_2511533018 
{
	
	public static int max_2511533018(Stack<Integer> s)
	{
		Stack<Integer> backup_3018 = new Stack<>();
		
		int maxValue_3018 = s.pop();
		
		backup_3018.push(maxValue_3018);
		
		while (!s.isEmpty())
		{
			int next_3018 = s.pop();
			backup_3018.push(next_3018);
			maxValue_3018 = Math.max(maxValue_3018, next_3018);
		}
		
		while (!backup_3018.isEmpty())
		{
			s.push(backup_3018.pop());
		}
		
		return maxValue_3018;
	}

	public static void main(String[] args) 
	{
		Stack<Integer> s_3018 = new Stack<>();
		
		s_3018.push(70);
		s_3018.push(12);
		s_3018.push(20);
		
		System.out.println("Isi stack " + s_3018);
		System.out.println("Stack teratas " + s_3018.peek());
		System.out.println("Nilai maks " + max_2511533018(s_3018));
	}

}
