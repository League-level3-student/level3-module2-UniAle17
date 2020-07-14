package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] testWords = {"One", "Two", "Three", "Four"};
		
		assertEquals(1, _00_LinearSearch.linearSearch(testWords, "Two"));
		assertEquals(3, _00_LinearSearch.linearSearch(testWords, "Four"));
		assertEquals(-1, _00_LinearSearch.linearSearch(testWords, "Six"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		
		int[] testNumbers = {1, 2, 3, 4};
		
		assertEquals(0, _01_BinarySearch.binarySearch(testNumbers, 0, testNumbers.length-1, 1));
		assertEquals(2, _01_BinarySearch.binarySearch(testNumbers, 0, testNumbers.length-1, 3));
		assertEquals(-1, _01_BinarySearch.binarySearch(testNumbers, 0, testNumbers.length-1, 5));
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		
		
		
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
