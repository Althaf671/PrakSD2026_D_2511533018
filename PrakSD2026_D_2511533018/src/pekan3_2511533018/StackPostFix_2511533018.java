package pekan3_2511533018;

import java.util.Scanner;
import java.util.Stack;

public class StackPostFix_2511533018 {
	
	
	public static int postFixEvaluate_2511533018(String ex)
	{
		Stack<Integer> s_3018 = new Stack<Integer>();
		Scanner input = new Scanner(ex);
		
		while (input.hasNext())
		{
			if (input.hasNextInt())
			{
				s_3018.push(input.nextInt());
			}
			else
			{
				String operator_3018 = input.next();
				
				int operand2_3018 = s_3018.pop();
				int operand1_3018 = s_3018.pop();
				
				if (operator_3018.equals("+"))
				{
					s_3018.push(operand1_3018 + operand2_3018);
				}
				else if (operator_3018.equals("-"))
				{
					s_3018.push(operand1_3018 - operand2_3018);
				}
				else if (operator_3018.equals("*"))
				{
					s_3018.push(operand1_3018 * operand2_3018);
				}
				else
				{
					s_3018.push(operand1_3018 / operand2_3018);
				}
			}
		}
		
		input.close();
		return s_3018.pop();
	}

	public static void main(String[] args) 
	{
		System.out.println("Hasil postfix = " 
				+ postFixEvaluate_2511533018("5 2 4 * + 7 -"));
	}

}
