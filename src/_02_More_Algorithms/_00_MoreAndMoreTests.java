package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	    
	    
	    
	    
	  }

	
	String multiply(int a, int b) {
		
		int product = a*b;
		
		String give = (a+ " x " +b+ " = " +product);
		
		
		
		return give;
		
	}
	
	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	
	boolean isPrime(int num) {
		
		boolean isPrime= true;
		
		for (int i = 2; i < num; i++) {
			
			if(num%i==0) {
			
			isPrime = false;
			
		}
		
			
		}
			
		return isPrime;
		
	}
	
//
	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	
	boolean isSquare(int input) {
		
		
		
		
		for (int i = 0; i <= input; i++) {
			
			if(i*i==input) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	

	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }

	boolean isCube(int value) {
		
		for (int i = 0; i <= value; i++) {
			
			if(i*i*i==value) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	

}
