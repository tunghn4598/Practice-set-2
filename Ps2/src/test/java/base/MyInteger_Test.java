package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyInteger_Test {

	@Test
	public void testMyInteger() {
		MyInteger n = new MyInteger(5);
		System.out.println(n.getValue());
		System.out.println(n.isEven());
		System.out.println(n.isOdd());
		System.out.println(n.isPrime());
		System.out.println(MyInteger.isEven(4));
		System.out.println(MyInteger.isOdd(4));
		System.out.println(MyInteger.isPrime(4));
		System.out.println(n.equals(6));
		System.out.println(n.equals(5));
		
		fail("Not yet implemented");
	}

}
