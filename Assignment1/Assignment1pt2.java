// Jaiden Borowski 

public class Assignment1pt2 {

	static int num = 13; // length of array 
	static int[] fibArr = new int[num]; 
	
	public static void main(String[] args) {
		// TESTING METHODS: 
		
		// fill array 
		iterativeFibArr(num); 
		
		// print out original array 
		printArray(); 
		
		// count number of items 
		numItems(); 
		
		// remove item that is in array 
		remove(3); 
		
		// attempt to remove item that is not in array 
		remove(100); 
		
		// print out array after removal to check it was successful   
		printArray(); 
		
		// count new number of items 
		numItems(); 
		
		// get random number 
		System.out.println("Random number from array: " + grab()); 
		
		// add 3 to the end of the array 
		add(3); 
		
		// print out array after modification 
		printArray(); 
	}
	
	// fibonacci method fills initial array 
	private static void iterativeFibArr(int n) { 
		if (n == 1) { 
			fibArr[0] = 0; 
		} else {
			fibArr[0] = 0; 
			fibArr[1] = 1; 
				
			for(int i = 2; i < n; i++) {
				fibArr[i] = fibArr[i-2] + fibArr[i-1]; 
			}
		} 
		
	} 

	// add a number to the list (allow to add duplicates) 
	private static void add(int item) { 
		num = num + 1; 
		
		int[] addArr = new int[num]; 
		
		for(int i = 0; i < fibArr.length; i++) {
			addArr[i] = fibArr[i]; 
		}
		
		addArr[num-1] = item; 
		
		fibArr = addArr; 
	}
	
	// remove the item (if it exists) from the list
	private static boolean remove(int item) {
		if (ifContains(item)) {
			num = num - 1; 
			
			int[] removeArr = new int[num]; 
			int counter = 0; 
			
			for (int i = 0; i < fibArr.length; i++) {
				if(fibArr[i] != item) {
					removeArr[counter] = fibArr[i]; 
					counter++; 
				}
			}
			
			fibArr = removeArr; 
			
			return true; 
		} else { 
			return false; 
		} 
	} 
	
	// check if the item exists in the list
	private static boolean ifContains(int item) {
		for (int i = 0; i < fibArr.length; i++) {
			if(fibArr[i] == item) {
				return true; 
			}
		}
		return false; 
	}
	
	// random draw a number from the list without removing
	private static int grab() {
		int randomNum = (int)(Math.random() * num); 
		return fibArr[randomNum]; 
	} 
	
	// prints out the number of unique items in the list (without duplicates) 
	private static void numItems() { 
		int numItems = 0; 
		
		if(fibArr.length > 0) {
			int prev = fibArr[0]; 
			numItems++; 
			
			for (int i = 1; i < fibArr.length; i++) {
				if (fibArr[i] != prev) {
					numItems++;  
					prev = fibArr[i]; 
				}
			}
		} 
		
		System.out.println("Number of unique numbers in array: " + numItems); 
	}
	
	private static void printArray() { 
		System.out.print("Fibonacci array: "); 
		for (int i = 0; i < fibArr.length; i++) { 
			System.out.print(fibArr[i] + " "); 
		}
		System.out.println(); 
	}
}
