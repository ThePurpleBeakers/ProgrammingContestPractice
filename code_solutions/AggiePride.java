
public class AggiePride
{

	public static void main(String[] args)
	{
		aggiepride(18);
	}

	public static void aggiepride(int N)
	{
		for (int i = 1; i <= N; i++)
		{
			System.out.println(buildString(i));
		}
	}

	public static String buildString(int size)
	{

		String phrase = "AggiePride";
		String output = "";
		int j = 0;

		for (int i = 0; i < size; i++)
		{
			if (j >= phrase.length())
			{
				j -= phrase.length();
			}

			output += phrase.substring(j, j + 1);
			j++;
		}

		return output;

	}

}
