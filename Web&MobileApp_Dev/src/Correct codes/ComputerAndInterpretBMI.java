import java.util.Scanner;

public class ComputerAndInterpretBMI {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		//Promt the user to enter weight in pounds
		System.out.print("Enter weight in pounds");
		double weight = input.nextDouble();
		
		//Promt the user to enter height in inches
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND=0.453359237; // Constant
		final double METERS_PER_INCH=0.0254; //Constant
		
		//Compute BMI
		double weightInkilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInkilograms / (heightInMeters * heightInMeters);
		
		//Display result
				
	}

}
