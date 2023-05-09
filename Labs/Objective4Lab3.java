
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    int age;
    int birthYear; 

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();
    birthYear = 2023 - age;



    System.out.println("You were born in " + birthYear + ".");
    input.close();
  }
}