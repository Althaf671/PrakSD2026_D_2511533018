package pekan2_2511533018;

import java.util.ArrayList;

public class ArrayList1_2511533018 {

	public static void main(String[] args) {
		
		// size of array list
		int n = 5;
		
		// declare array list
		ArrayList<Integer> arrli = new ArrayList<>();
		
		// append new element at the end of the list
		for (int i = 1; i <= n; i++)
			arrli.add(i);
		
		System.out.println(arrli);
		
		// remove index number 3
		arrli.remove(3);
		
		System.out.println(arrli);
		
		// print element one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}

}
