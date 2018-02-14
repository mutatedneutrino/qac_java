
public class Letters {

	public static void main(String[] args) {
		String MSG = " I am going to London ";
		
		String from = "London";
		String to = "Manchester";
		
		//stringProcessing(MSG);
		
		//word(MSG);
		
		//print(MSG);
		
		//printBack(MSG);
		
		replaceString(MSG,from,to);
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
		 String sub = "";
		 
		 for (int i = MSG.length(); i > 0; i--)
		 {			
			 sub = (MSG.substring(i-1,i)+ sub);
			 
			 if (MSG.substring(i-1,i).equals(space))
			 {
				 System.out.println(sub);
				 sub = "";
			 }				 
		 }
	}

	public static void replaceString (String MSG, String from, String to)
	{
		String[] arr = MSG.split(from);
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i<MSG.length();i++)
		{
			output.append(arr[i]).append(to);
			
			
		}
	}
}
	
	
   /* public static void main(String[] args)
    {
        String originalString = "This car is my car";
        String replacedString = replaceMethod(originalString, "car", "bike");
        System.out.println(replacedString);
    }

    static String replaceMethod(String str, String from, String to) 
    {
        String[] arr = str.split(from);
        StringBuilder output = new StringBuilder();

        int i = 0;
        for (; i < arr.length - 1; i++)
        output.append(arr[i]).append(to);

        output.append(arr[i]);
        if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + from))
            output.append(to);

        return output.toString();
    }
} */

