package pekan3_2511533018;

public class stackArray_2511533018 
{
	private static final int MAX_3018 = 1000;
	
	private int top_3018;
	
	private int a_3018[] = new int[MAX_3018];
	
	
	public boolean isEmpty_2511533018()
	{
		return (top_3018 < 0);
	}
	
	public stackArray_2511533018()
	{
		top_3018 = -1;
	}
	
	public boolean push_2511533018(int x)
	{
		if (top_3018 >= (MAX_3018 - 1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else 
		{
			a_3018[++top_3018] = x;
			System.out.println(x + " dimasukkan dalam stack.");
			return true;
		}
	}
	
	public int pop_2511533018()
	{
		if (top_3018 < 0)
		{
			System.out.println("Stack Underflow.");
			return 0;
		}
		else
		{
			int x = a_3018[top_3018--];
			return x;
		}
	}
	
	public int peek_2511533018()
	{
		if (top_3018 < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x = a_3018[top_3018];
			return x;
		}
	}
	
	public void print_2511533018()
	{
		for (int i = top_3018; i >- 1; i--)
			System.out.println(" " + a_3018[i]);
	}
}
