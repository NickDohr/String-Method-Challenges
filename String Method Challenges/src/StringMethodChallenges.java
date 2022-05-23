import java.util.Scanner;

public class StringMethodChallenges
	{
		public static void main(String[] args)
		{
			//Caps to Lower Case
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("Hello user, give me a word in all caps!");
			String word = userStringInput.nextLine();
			System.out.println(word.substring(0,1) + word.substring(1).toLowerCase());
			//Vertical Letters
			System.out.println("Now, give me a random word!");
			String word2 = userStringInput.nextLine();
			for(int  i = 0; i < word2.length(); i++)
				{
					System.out.println(word2.substring(i, i + 1));
				}
			//Sentence Vowel Count
			System.out.println("Give me a sentence!");
			String sentence = userStringInput.nextLine();
			int vowelNumber = 0;
			for(int i = 0; i < sentence.length(); i++)
				{
					String letter = sentence.substring(i, i + 1);
					switch(letter)
					{
						case "A":
						case "a":
						case "E":
						case "e":
						case "I":
						case "i":
						case "O":
						case "o":
						case "U":
						case "u":
								{
									vowelNumber++;
									break;
								}
						
					}
					
				}
			if (vowelNumber == 1)
				{
			System.out.println("There is " + vowelNumber + " vowel in that sentence!");
				}
			else if(vowelNumber > 1)
				{
				System.out.println("There are " + vowelNumber + " vowels in that sentence!");
				}
		
		
			
			
		}
	}
