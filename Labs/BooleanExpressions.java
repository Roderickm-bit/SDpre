import java.util.Scanner;

public class BooleanExpressions {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean bool1;
		boolean bool2;
		boolean bool3; 
		boolean bool4; 
		boolean bool5; 
		boolean bool6;
		double num1;
		double num2;

		System.out.println("Please choose two numbers.");
		System.out.print("First number:");
		num1 = keyboard.nextDouble();
		System.out.print("Second number:");
		num2 = keyboard.nextDouble();

		bool1 = (num1 < num2);
		bool2 = (num1 > num2);
		bool3 = (num1 <= num2);
		bool4 = (num1 >= num2);
		bool5 = (num1 == num2);
		bool6 = (num1 != num2);

		System.out.println(num1 + " is less than " + num2 + " : " + bool1 + ".");
		System.out.println(num1 + " is greater than " + num2 + " : " + bool2 + ".");
		System.out.println(num1 + " is less than or equal to " + num2 + " : " + bool3 + ".");
		System.out.println(num1 + " is greater than or equal to " + num2 + " : " + bool4 + ".");
		System.out.println(num1 + " is equal to " + num2 + " : " + bool5 + ".");
		System.out.println(num1 + " is not equal to " + num2 + " : " + bool6 + ".");

	}
}