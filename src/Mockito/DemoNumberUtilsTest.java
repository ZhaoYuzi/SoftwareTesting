package Mockito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoNumberUtilsTest {

	DemoNumberUtils check = new DemoNumberUtils();
	String str = "123";
	double array[]= {1.2,3.1,-5.0,3,0};
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToIntString() {
		assertEquals(123,check.toInt(str),0);
	}

	@Test
	public void testMinDoubleArray() {
		assertEquals(-5.0,check.min(array),0);
	}

	@Test
	public void testMaxDoubleArray() {
		assertEquals(3.1,check.max(array),0);
	}

	@Test
	public void testIsNumber() {
		assertTrue(check.isNumber(str));
	}

}
