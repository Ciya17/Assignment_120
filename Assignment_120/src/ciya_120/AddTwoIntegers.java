package ciya_120;

import java.util.Scanner;

public class AddTwoIntegers {
	
public static void main(String[] args) {
int x, y, sum;
Scanner myObj = new Scanner(System.in);
System.out.println("Enter the first number:");
x = myObj.nextInt();
System.out.println("Enter the second number:");
y = myObj.nextInt();
sum = x + y;
System.out.println("Sum is: " + sum);

       }
}