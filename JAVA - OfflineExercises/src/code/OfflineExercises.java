package code;

public class OfflineExercises {


	public String doubleChar(String input) {
		

		// Given a string, return a string where
		// for every char in the original,
		// there are two chars.

		// doubleChar("The") → "TThhee"
		// doubleChar("AAbb") → "AAAAbbbb"
		// doubleChar("Hi-There") → "HHii--TThheerree"
		
		String output = "";
		String letter = "";
		
		for (int j = 0; j < input.length(); j++)
		{ 
			letter = input.substring(j,j+1);
			
			output = (output + letter + letter);
		}
		

		
		return output;
	}

	public String getSandwich(String input) {
		//
		// A sandwich is two pieces of bread with something in between. Return the
		// string that is between the first and last appearance of "bread" in the
		// given string, or return the empty string "" if there are not two pieces
		// of bread.

		// getSandwich("breadjambread") → "jam"
		// getSandwich("xxbreadjambreadyy") → "jam"
		// getSandwich("xxbreadyy") → ""

		input = input.replace("bread"," ");
		String output = "";
		int first = 0;
		int last = 0;
		int count = 0;
		
		for (int i = 0; i<input.length();i++)
		{
			if(input.substring(i, i+1).equals(" "))
			{
			count = count + 1;
			}
		}	
		
		for (int i = 0; i<input.length();i++)
		{
			if(input.substring(i, i+1).equals(" "))
			{
				last = i;
			}
		}		
		for (int i = input.length(); i>0;i--)
		{
			if(input.substring(i-1, i).equals(" "))
			{
				first = i;
			}
		}
		
		if (count == 2) 
		{
			output = input.substring(first,last);
		}
			
		return output;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		return false;
	}


	public String nTwice(String input, int a) {
		
		// Given a string and an int n, return a string made of the first and last n
		// chars from the string. The string length will be at least n.

		// nTwice("Hello", 2) → "Helo"
		// nTwice("Chocolate", 3) → "Choate"
		// nTwice("Chocolate", 1) → "Ce"

		
		int l = input.length();
		String output = (input.substring(0, a) + input.substring(l-a,l));
				
		return output;
	}


	public boolean endsly(String input) {
		
		// Given a string, return true if it ends in "ly".

		// endsLy("oddly") → true
		// endsLy("y") → false
		// endsLy("oddy") → false
		
		boolean ly = false;
		int length = input.length();
		
		if (length > 2 && input.substring(length-2, length).equals("ly"))
		{
		ly = true;
		}
		
		return ly;
	}
	
	
	public String stringClean(String input) {
	
		// Given a string, return recursively a "cleaned" string where adjacent
		// chars that are the same have been reduced to a single char. So "yyzzza"
		// yields "yza".

		// stringClean("yyzzza") → "yza"
		// stringClean("abbbcdd") → "abcd"
		// stringClean("Hello") → "Helo"
		
		String output = "";
		int l = input.length();
		
		for (int i =0; i < l-1;i++)
		{
			if (input.charAt(i) != input.charAt(i+1))
			{
				output = (output + input.substring(i,i+1));
			}		}
		
		output = (output + input.substring(l-1,l));
			
		return output;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		int[] n = new int[input];
		int output = 0;
		
		for (int i: n)	
		{
			n[i] = n[i-1] + n[i-2];
			
		}
		return output;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		
		return -1;
	}

}
