import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1;
    int num2;
    int num3;
    double dub1;
    double dub2; 
    double dub3;

    System.out.println("Please enter the first whole number you would like to add");
    num1 = keyboard.nextInt();
    System.out.println("Please enter the second whole number you would like to add");
    num2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number you would like to add");
    num3 = keyboard.nextInt();

    int sum = num1 + num2 + num3;

    System.out.println("The sum of " + num1 + " and " + num2 + " and " + num3 + " is " + sum + ".");

    System.out.println("Please enter the first decimal number you would like to add");
    dub1 = keyboard.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add");
    dub2 = keyboard.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add");
    dub3 = keyboard.nextDouble();

    double sum2 = dub1 + dub2 + dub3;

    System.out.println(" The sum of " + dub1 + " and " + dub2 + " and " + dub3 + " is " + sum2 + ".");


    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
