import java.util.Scanner;

public class NameToLength 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your name to find out its length: ");
		Scanner yourName = new Scanner(System.in);
		String name = yourName.nextLine();
		char [] ch = name.toCharArray();
		int nameLength = 0;

		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i]!=' ') 
			{
				nameLength++;
			}
		}
		System.out.println("The name " + name + " contains " + nameLength++ + " letters");
	}
}