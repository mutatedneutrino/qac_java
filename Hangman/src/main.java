import java.io.*;
import java.util.*;


public class main {

	static ArrayList<String> wordList = new ArrayList<>();
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Hangman! I will choose a word and you have to guess! Are you ready?");
		System.out.println("You have 5 guesses!");
		System.out.println(" ");
		
		File file = new File("D:\\Documents\\words.txt");
		Scanner scanner;
			try {
				scanner = new Scanner(file);
				
				while (scanner.hasNextLine()) 
					{
					wordList.add(scanner.nextLine());
					}	
				
				} 
			
			catch (FileNotFoundException e) 
			
			{
				e.printStackTrace();
			}	
			
		int size = wordList.size();
		Random rand = new Random();
		int randInt = rand.nextInt(size);
			
		String word = wordList.get(randInt);
		String fword = word.toLowerCase().replaceAll("[',.-]", "");
			
			
		System.out.println(fword);	
			
			
		String[] letters = new String[fword.length()];
		String[] secretWord = new String[fword.length()];
					
			for (int i = 0; i < fword.length(); i++) 
			{
				letters[i]= "_ ";
				secretWord[i] = String.valueOf(fword.charAt(i));
			}
			
			for (int i = 0; i < fword.length(); i++) 
			{ 
				System.out.print(letters[i]);
				System.out.print(secretWord[i]);
			}	
	int incorrect = 0;		
	String[] newOrder = new String[fword.length()];
	int j = 0;
	String[] past = new String[fword.length()*3];
	
		do{		
				
			String guess = guessEntry(fword,j,past);	
						
			newOrder = letterCheck(secretWord,guess,letters,fword);
			
			int wrong = wrong(secretWord,guess,letters,fword,incorrect);
			
				incorrect = wrong;
				
				for (int i = 0; i < fword.length(); i++)
				{
					System.out.print(newOrder[i]);
				}
				
				j=j+1;
				
				System.out.println("");
				System.out.println("");
				System.out.println("You have "+(5-incorrect)+" incorrect guesses yet");
		}
		while(incorrect<=5 & (!Arrays.equals(secretWord, newOrder)));
		
		if (incorrect == 6)
		{
			System.out.println("");
			System.out.println("You have run out of chances");
			System.out.println("Would you like to play again?");
		}
		else
		{
			System.out.println("");
			System.out.println("Congratulations, you guessed the word!");
			System.out.println("");
			System.out.println("Would you like to play again?");
		}
		
	}	
	
	public static String guessEntry(String fword, int j, String[] past)
	{		
		    
			Scanner keyboard = new Scanner(System.in);
			System.out.println("");
			System.out.println("Guess a letter!");
			String guess = keyboard.nextLine();	
			
			String[] dave = pastGuess(guess,fword,j,past);
			
			return guess;
	}
	
	public static String[] pastGuess(String guess, String fword, int j, String[] past)
	{		
			past[j] = guess;
			
			System.out.println("");
			System.out.println("Previous Guesses:");
			for(int i =0; i <= j;i++)
			{
				System.out.print(past[i]);
			}		
			System.out.println("");
			
			return past;
	}

	public static String[] letterCheck(String[] secretWord, String guess, String[] letters, String fword)
	{
			boolean correct = false;
			
		for (int i=0; i < fword.length(); i++) 
		{					
			if (secretWord[i].equals(guess))
			{
				letters[i] = guess;	
				correct = true;
			}
		}	
		return letters;
   }
	
	public static int wrong(String[] secretWord, String guess, String[] letters, String fword, int incorrect)
	{
			boolean correct = false;
			
		for (int i=0; i < fword.length(); i++) 
		{					
			if (secretWord[i].equals(guess))
			{
				correct = true;
			}
		}	
		
		if (!correct)
		{
			if (incorrect == 0) 
			{
				System.out.println("");
				System.out.println("Wrong guess try again");
				System.out.println("___.___");
			}
			
			if (incorrect == 1) 
			{
				System.out.println("");
				System.out.println("Wrong guess try again");				
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
				
			}
	
			if(incorrect == 2) 
			{
				System.out.println("");
				System.out.println("Wrong guess try again");
				System.out.println("   ________");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
	
			if(incorrect == 3) 
			{
				System.out.println("");
				System.out.println("Wrong guess try again");
				System.out.println("   _________");
				System.out.println("   |       |");
				System.out.println("   |       O");
				System.out.println("   | ");                      
				System.out.println("   |");
				System.out.println("___|___");
			}
	
			if(incorrect == 4) 
			{
				System.out.println("");
				System.out.println("Wrong guess try again");
				System.out.println("   _________" );
				System.out.println("   |       |" );
				System.out.println("   |       O" );
				System.out.println("   |      (|) ");
				System.out.println("   |"         );
				System.out.println("___|___"      );
			}
	
		incorrect = incorrect+1;		
		}	
			
		return incorrect;
   }
	
	
}	

