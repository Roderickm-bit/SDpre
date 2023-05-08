
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    String age = input.nextLine();

    System.out.println("You were born in ");
    String birthYear = input.nextLine();
    input.close();
  }
}