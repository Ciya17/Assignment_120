package ciya_120;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciSeriesRBCA22120Test {


		    @Test
		    public void testGenerateSeries() {
		    	FibonacciSeriesRBCA22120 Fibonacci=new FibonacciSeriesRBCA22120();
		        int n = 5;
		        int[] expected = {0, 1, 1, 2, 3};
		        int[] result = Fibonacci.generateSeries(n);
		        assertArrayEquals(expected, result);
		    }

		    @Test
		    public void testGenerateSeriesWithZeroTerms() {
		    	FibonacciSeriesRBCA22120 Fibonacci=new FibonacciSeriesRBCA22120();
		        int n = 0;
		        int[] expected = {};
		        int[] result = Fibonacci.generateSeries(n);
		        assertArrayEquals(expected, result);
		    }
		
	}


