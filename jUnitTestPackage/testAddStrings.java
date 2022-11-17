package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test()
	{
		assertEquals("Hellothere",jUnitFunctions.addstring("Hello","there"));
		assertEquals("javaprogram",jUnitFunctions.addstring("java","program"));
		assertEquals("nihao",jUnitFunctions.addstring("ni","hao"));
		assertEquals("HelloHellO",jUnitFunctions.addstring("Hello","HellO"));
		assertEquals("Helloh",jUnitFunctions.addstring("Hello","h"));
	}

}
