
public class FibonacciRecursive implements Fibonacci 
{
	public int fibonacci (int n)
	{
		//fib(0) = 0; fib(1) = 1 ... and otherwise:
		//	 * fib(n) = fib(n-1) + fib(n-2)
		
		
		if (n == 2)
		{
			return 1;
		}
		else if (n == 1)
		{
			 return  1;
		}
		
		else
		{
			return fibonacci (n-1) + fibonacci (n-2);
		}
	}

}
