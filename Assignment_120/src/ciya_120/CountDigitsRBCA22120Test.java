package ciya_120;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountDigitsRBCA22120Test {

	    @Test
	    public void testCountDigitsPositiveNumber() {
	    	CountDigitsRBCAC22120 NumberOfDigits =new CountDigitsRBCAC22120();
	        int result = NumberOfDigits.countDigits(12345);
	        assertEquals(5, result);
	    }

	    @Test
	    public void testCountDigitsZero() {
	    	CountDigitsRBCAC22120 NumberOfDigits =new CountDigitsRBCAC22120();
	        int result = NumberOfDigits.countDigits(0);
	        assertEquals(1, result);
	    }
	}


