
public class FactorialRecursive  implements Factorial
{
	public int factorial(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 2;
		}
		else // might need to be else if(n>=3) but then there needs to be another else statement
		{
			return factorial(n-1)*n;
		}
	}
	

}
