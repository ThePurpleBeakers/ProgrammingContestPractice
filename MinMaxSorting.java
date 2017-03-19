import java.io.IOException;
import java.util.Arrays;

public class MinMaxSorting
{

	public static void main(String[] args) throws IOException
	{

		int[] a = { 89, 45, 68, 90, 29, 34, 17 };
		int[] b = { 5, 100, 8, 999, 2 };

		sort(a);
		sort(b);

	}

	public static void sort(int[] a)
	{
		int START = 0;
		int END = a.length - 1;

		int minIndex = 0;
		int maxIndex = 0;

		while (START < END)
		{

			System.out.println(Arrays.toString(a));

			for (int i = START; i <= END; i++)
			{
				if (a[i] < a[minIndex])
					minIndex = i;

			}

			swap(a, START, minIndex);

			for (int i = START; i <= END; i++)
			{
				if (a[i] > a[maxIndex])
					maxIndex = i;
			}

			swap(a, END, maxIndex);

			System.out.println("Min Index: " + minIndex);
			System.out.println("Max Index: " + maxIndex);
			System.out.println("\n");

			START++;
			END--;

		}

		System.out.println("The sorted array is: " + "\n");
		System.out.println(Arrays.toString(a));
	}

	public static void swap(int[] a, int b, int c)
	{
		int tmp = a[b];
		a[b] = a[c];
		a[c] = tmp;
	}

}
