import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner Scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = Scanner.nextInt();

      if (userNum > 0) {
        System.out.println(" The number is positive ");
      }
      else {
        System.out.println(" The number is negative ");
      }

      /*
        Your solution goes here
      */

      Scanner.close();
  }
}