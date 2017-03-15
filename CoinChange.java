public class CoinChange
{

	public static void main(String[] args)
	{

		System.out.println("18.95 20.00 \t\t " + coinchange(18.95, 20.00));
		System.out.println("1.33 2.00 \t\t " + coinchange(1.33, 2.00));
		System.out.println("4.87 5.00 \t\t " + coinchange(4.87, 5.00));
		System.out.println("1.50 1.50 \t\t " + coinchange(1.50, 1.50));
	}

	public static String coinchange(double cost, double payment)
	{
		String output = "";
		double change = payment - cost;

		double[] vals = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };
		String[] names = { " dollar ", " fifty-cent piece ", " quarter ", " dime ", " nickel ", " penny " };

		if (change == 0)
			return "Exact change";

		for (int i = 0; i < vals.length; i++)
		{
			double val = vals[i];

			if (change / val >= 1)
			{
				int cointRet = (int) (change / val);
				change -= cointRet * val;

				change *= 100;
				change = Math.round(change);
				change /= 100;

				output += cointRet + names[i];
			}
		}

		return output;
	}

}
