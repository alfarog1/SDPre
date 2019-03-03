import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, CurrentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are?");

    age = input.nextInt();
    CurrentYear = 2019;
    birthYear = CurrentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();

  }
}
