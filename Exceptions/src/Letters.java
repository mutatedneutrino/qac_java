
public class Letters {

	public static void main(String[] args) {
		String MSG = "I am going to London";
		
		String w = MSG.substring(2,3);
		
		//stringProcessing(MSG);
		
		//word(MSG);
		
		//print(MSG);
		
		printBack(MSG);
	}

	
	public static void stringProcessing(String MSG)
	{
		int i;
		
		for (i = 0; i < MSG.length(); i++)
		{
			System.out.println(MSG.substring(i,i+1));
		}
	}
	
	public static void word(String MSG)
	{
		 String space = " ";
		 int words = 1;
		 
		 for (int i = 0; i < MSG.length(); i++)
		 {			 
			 if (MSG.substring(i,i+1).equals(space))
			 {
				 words = words + 1;
			 }
		 }
		 
		 System.out.println(words);
	}

	public static void print(String MSG)
	{
		 String space = " ";
		 int words = 1;
		 
		 for (int i = 0; i < MSG.length(); i++)
		 {			 
			 if (MSG.substring(i,i+1).equals(space))
			 {
				 System.out.println("");
			 }
			 else 
			 {
				 System.out.print(MSG.substring(i,i+1));
			 }
		 }

	}

	public static void printBack(String MSG)
	{
		 String space = " ";
		 int words = 0 ;
		 
		 int startOfWord = 0;
		 
		 for (int i = MSG.length(); i >0; i--)
		 {			 
			 if (MSG.substring(i-1,i).equals(space))
			 {
				 System.out.println("");
				 startOfWord = i+1;
			}
			 System.out.print(MSG.substring(i,startOfWord));

		 }
	}

}
