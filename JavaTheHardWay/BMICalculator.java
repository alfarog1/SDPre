import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double in, ft, lbs, bmi;
		
		System.out.print( "Your height in (feet only): " );
		ft = keyboard.nextDouble();
		
		System.out.print( "Your height in (inches): " );
		in = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		lbs = keyboard.nextDouble();
		
		bmi = lbs / (((ft*12)+in)*((ft*12)+in));
		
		System.out.println( "Your BMI is " + bmi );
	}
}