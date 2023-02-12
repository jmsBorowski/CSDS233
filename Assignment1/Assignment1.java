// Jaiden Borowski 

public class Assignment1 {
	
	public static void main(String[] args) {				
		// iterative more efficient 
		int fibbonacciIte = iterativeFib(7);
		System.out.println(fibbonacciIte); 
	} 
	
	// iterative fibonacci sequence 
	// Big-O: O(n) 
	private static int iterativeFib(int n) {	
		if (n == 0) { 
			return 0; // O(1) 
		} else if (n == 1 || n == 2) {
			return 1; // O(1) 
		} else { 
			// fibb = fib_n-1 + fib_n-2
			int fibn_1 = 1; 
			int fibn_2 = 1; 
			int current = 1; 
			
			for(int i = 3; i <= n; i++) { // O(n) 
				current = fibn_1 + fibn_2; 
				fibn_2 = fibn_1; 
				fibn_1 = current; 
			}
			
			return current; 
		} 
	} 
		
	// recursive fibonacci sequence 
	// Big-O: O(2^n) 
	private static int recursiveFib(int n) {
		// base 
		if (n == 0) { 
			return 0; // O(1) 
		} else if (n == 1 || n == 2) {
			return 1; // O(1) 
		} 

		// recursion 
		else { 
			return recursiveFib(n-1)+recursiveFib(n-2); // O(2^n) 
		} 
	} 
} 
