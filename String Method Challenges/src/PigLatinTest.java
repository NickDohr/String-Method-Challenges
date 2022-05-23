import java.util.Scanner;

public class PigLatinTest
	{
		public static void main(String[] args)
		{
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("Give me a sentence!");
			String pigLatin = userStringInput.nextLine();
			
			String[] arrSplit = pigLatin.split(" ");
			for(int i = 0; i < arrSplit.length; i++)
				{
					switch(arrSplit[i].substring(0,1))
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
											System.out.print(arrSplit[i].substring(1) + "-"+ arrSplit[i].substring(0,1) + "way ");
											break;
										}
								default:
									System.out.print(arrSplit[i].substring(1) + "-" + arrSplit[i].substring(0,1) + "ay " );
								
								}
				}
		
			
		}
	}
