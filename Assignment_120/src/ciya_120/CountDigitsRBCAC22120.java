package ciya_120;

public class CountDigitsRBCAC22120 {
	    public static int countDigits(int number) {
	        if (number == 0) {
	            return 1; // Special case for 0
	        }
	        int count = 0;
	        while (number != 0) {
	            number /= 10;
	            ++count;
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        int number = 123456789;
	        int count = countDigits(number);
	        System.out.println("Number of digits in " + number + " is " + count);
	    }
	}




