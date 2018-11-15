import java.util.Scanner;
public class Net_Income {
	public static void main (String[] args){

			int hours;
			double rate;
			Scanner input= new Scanner (System.in);
			System.out.println("Enter your hourly rate");
			rate=input.nextDouble();
			System.out.println("Enter your total worked time in a week");
			hours=input.nextInt();
			System.out.println("Gross Income: "+rate * hours);
			double Gross = (int) (rate * hours) ;
			double CPP = Gross*5/100;
			double EI = Gross*2/100;
			double Net = Gross-CPP-EI;
			System.out.println("CPP:"+CPP);
			System.out.println("EI:"+EI);
			System.out.println("Net Income:"+ Net);
			input.close();
		}
	}
