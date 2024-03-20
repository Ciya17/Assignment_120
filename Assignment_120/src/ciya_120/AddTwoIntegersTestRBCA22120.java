package ciya_120;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoIntegersTestRBCA22120 {

	@Test
	public void testSum() {
		AddTwoIntegersRBCA22120 adder=new AddTwoIntegersRBCA22120();
		int result = adder.sum(4, 9);
		assertEquals(13,result);
	}

	@Test
	public void testAddWithNegativeNumbers() {
		AddTwoIntegersRBCA22120 adder=new AddTwoIntegersRBCA22120();
		int result = adder.sum(-4, -9);
		assertEquals(-13,result);
	}
}
