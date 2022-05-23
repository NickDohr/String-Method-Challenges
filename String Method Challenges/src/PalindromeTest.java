import java.util.Scanner;
public class PalindromeTest
	{

		public static void main(String[] args)
			{
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Give me a sentence!");
				String palindrome = userStringInput.nextLine();
				palindrome = palindrome.toLowerCase();
				palindrome = palindrome.replace(" " ,"" );
				StringBuffer test = new StringBuffer(palindrome);
				test.reverse();
				System.out.println(test);
				if(test.reverse().toString().equals(palindrome))
					{
						System.out.println("You have given me a palindrome!");
					}
				else
					{
						System.out.println("You have not given me a palindrome!");
					}

			}

	}
