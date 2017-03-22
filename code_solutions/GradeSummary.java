public class GradeSummary
{

	public static void main(String[] args)
	{

		double[] grades = { 45, 99, 71, 73, 90, 65, 83, 55, 54, 88 };
		
		
		double avg = calcAvg(grades);
		
		System.out.println("Average: " + avg);
		
		printGrades(tallyGrades(grades, avg));
	

	}

	public static double calcAvg(double[] grades)
	{
		double average = 0.0;

		for (double grade : grades)
		{
			average += grade;
		}

		return average / grades.length;
	}

	public static int[] tallyGrades(double[] grades, double avg)
	{
		
		/* TALLY
		 * INDEX:	GRADE:
		 * 0		A
		 * 1		B
		 * 2		C
		 * 3		D
		 * 4		F
		 */
		int[] tally = new int[5];
		

		for (double grade : grades)
		{

			if (grade > avg && grade < 77)
			{
				tally[2] += 1;
				continue;
			}

			if (grade >= 93)
			{
				tally[0] += 1;

				continue;
			}

			if (grade >= 85)
			{
				tally[1] += 1;

				continue;
			}

			if (grade >= 77)
			{
	
				tally[2] += 1;

				continue;
			}

			if (grade >= 70)
			{
				tally[3] += 1;

				continue;
			}

			tally[4] += 1;

		}

		return tally;

	}
	
	public static void printGrades(int[] tally)
	{
		String[] letter = {"A", "B", "C", "D", "F"};
		
		for(int i = 0; i < tally.length; i++)
		{
			System.out.println(letter[i] + ": " + tally[i]);
		}
	}
	
}
