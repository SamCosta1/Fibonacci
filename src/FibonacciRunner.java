
public class FibonacciRunner {

	public static void main(String[] args) {/*
		for (int i = 1; i < 100; i++)
			Fibonacci.getFibValue(i);*/
		
		for (int i = 2; i < 100; i++)
			System.out.println(Fibonacci.getFibValue(i) / (double)Fibonacci.getFibValue(i-1));
	}
}
