package ciya_120;

public class CheckArmstrongNumberRBCA22120 {
	public static void main(String[] args) {
		int number = 600, originalNumber, remainder, result = 0;
		originalNumber = number;
		while (originalNumber != 0)
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if(result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrongnumber.");
		}
		

}
