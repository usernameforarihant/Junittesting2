package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test()
	{
		assertEquals(300,jUnitFunctions.add(100,200));
		assertEquals(500,jUnitFunctions.add(300,200));
		assertEquals(800,jUnitFunctions.add(600,200));
		assertEquals(1000,jUnitFunctions.add(100,900));
		assertEquals(120,jUnitFunctions.add(100,20));
	}

}
