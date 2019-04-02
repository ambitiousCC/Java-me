package work_1;

public class The_Fibonacci_Sequence {
	public static void main(String[] args)
	{
		System.out.println("This program lists the Fibonacci sequence:");
		long fib0 = 0;
		long fib1 = 1;
		long fibOut = 1;
		System.out.println(fib0+"\n"+fib1);
		while(fibOut<10000)
		{
			System.out.println(fibOut);
			fibOut = fib0 + fib1;
			fib0 = fib1;
			fib1 = fibOut;
		}
	}
}
