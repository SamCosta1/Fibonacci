import java.util.ArrayList;

public class Fibonacci {
	
	public static final ArrayList<Long> vals = new ArrayList<Long>();
	
	public static long getFibValue(int val) {
		
		if (val <= 0)
			throw new IllegalArgumentException("Fib (" + val + ") isn't a thing");
		
		if (vals.size() == 0)
			initVals();
		
		if (val <= vals.size()) 
			return vals.get(val - 1);
		
		return calculateFib(val);
		
	}
	
	private static long calculateFib(int val) {
		while (vals.size() < val) 
			vals.add(vals.get(vals.size() - 1) + vals.get(vals.size() - 2));		
		
		
		return vals.get(vals.size() - 1);
	}
	
	public static void initVals() {
		vals.add(1L);
		vals.add(1L);
	}
}
