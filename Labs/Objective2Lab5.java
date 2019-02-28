public class Objective2Lab5 {
  public static void main(String[] args) {
    int side1, side2, c2;
    Double hypotenuse;

    side1 = 10;
    side2 = 8;
    c2 = (side1*side1) + (side2*side2);

    hypotenuse = Math.sqrt(c2);

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
