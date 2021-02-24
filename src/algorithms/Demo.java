package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 23, 76, 344, 763, 11, 99};
		int[] sortedNumbers = {5, 9, 8, 12, 18, 21, 26, 29, 35, 39, 45, 49, 51, 58, 59, 61, 71, 88, 91, 94};		
		
		
		// Call the linear function that searches for a specific number.
		int pos = algorithms.Search.linearSearch(numbers, 76);
		System.out.println("Found at position: " + pos);
		
		// Call the binary search
		int index = algorithms.Search.binarySearch(sortedNumbers, 59, 0, sortedNumbers.length);
		System.out.println("Found at position: " + index);
	
	
	
	}

}
