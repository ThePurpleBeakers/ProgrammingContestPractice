import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("sentences.txt")); // Create text file sentences.txt and put in project folder.

		while (file.hasNextLine())
		{
			System.out.println(file.nextLine());
		}
	}

}
