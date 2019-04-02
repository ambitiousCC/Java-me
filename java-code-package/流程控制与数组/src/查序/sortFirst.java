package ≤È–Ú;

import java.util.*;

public class sortFirst {
	
	public static void testsort() {
		String[] input = {"i","have","an","egg"};
		String[] expected = {"an", "egg", "have", "i"};
		
		Sort.sort(input);
		
		for(int i = 0; i < input.length; i++) {
			if(!java.util.Arrays.equals(input, expected))
			{
				System.out.println("Error!");
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		testsort();
	}
}
