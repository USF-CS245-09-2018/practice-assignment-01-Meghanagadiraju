
public class FibonacciIterative implements Fibonacci
{
	public int fibonacci (int n)
	{
		if (n < 2)
		{
			return n;
		}
		int total = 1;
		int subtotal = 1;
		for (int i = 2; i< n; i++)
		{
			int temp = total;
			total += subtotal;
			subtotal = temp;
		}
		return total;
		
		
	}
	/**public void main (String [] args)
	{
		System.out.println(fibonacci(5)); 
	}**/
}
