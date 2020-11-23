package Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LangMathUsageTest {
	public double []array= {1.0, 3.4, 0.8, 7.1, 4.6 };
	LangMathUsage check = new LangMathUsage();
	
	@Before				
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDemoNumberUtils() {		
		assertTrue(check.demoNumberUtils());
	}

	@Test
	public void testMaximum() {
		assertEquals(7.1,check.Maximum(array),0);
	}
	
	@Test
	public void testMinimum() {
		assertEquals(0.8,check.Minimum(array),0);
	}

	@Test
	public void testMaxAddTo3() {
		LangMathUsage spy1 = spy(LangMathUsage.class);
		when(spy1.Maximum(array)).thenReturn(7.1);
		System.out.println("spy1.Maximum(array)="+spy1.Maximum(array));
		System.out.println("spy1.MaxAddTo3(array)="+spy1.MaxAddTo3(array));
		assertEquals(7.1*3,spy1.MaxAddTo3(array),0);
	}

	@Test
	public void testMaxSubMin() {
		LangMathUsage spy1 = spy(LangMathUsage.class);
		when(spy1.MaxAddTo3(array)).thenReturn(7.1*3);
		assertEquals(7.1*3-0.8,spy1.MaxSubMin(array),0);
	}

}
