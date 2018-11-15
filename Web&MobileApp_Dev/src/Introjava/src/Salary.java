import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me your name");
		String name = input.nextLine();
		System.out.println("Tell me your payRate");	
		int payRate = input.nextInt();
		System.out.println("Tell me your your work hours for 2 weeks");	
		int workedHours = input.nextInt();
		double payAmount, grossPayment, netPayment, cpp, ei;
		switch (payRate) {
		case 1:
			payAmount = 12.65;
			break;
		case 2:
			payAmount = 13.65;
			break;
		case 3:
			payAmount = 14.65;
			break;
		case 4:
			payAmount = 15.65;
			break;
		case 5:
			payAmount = 16.65;
			break;
		case 6:
			payAmount = 17.65;
			break;
		case 7:
			payAmount = 18.65;
			break;
		case 8:
			payAmount = 19.65;
			break;
		case 9:
			payAmount = 20.65;
			break;
		default:
			payAmount = 21.65;
			
		}
		if(workedHours > 80) {
			grossPayment = (80 * payAmount) + (workedHours-80) * 1.5 *payAmount;
		}else {
			grossPayment = (80 * payAmount) + (workedHours-80) * 1.5 *payAmount;
		}
		cpp = grossPayment * 0.05;
		ei = grossPayment * 0.02;
		netPayment = grossPayment -cpp -ei;
		System.out.println("Name: " + name);
		System.out.println("PayRate: " + payRate);
		System.out.println("Gross Payment: $" + grossPayment);
		System.out.printf("Net Payment: $" + "%.2f", netPayment);
		System.out.printf("\nCPP:$" + "%.2f", cpp);
		System.out.printf("\nEI: $" + "%.2f", ei);
		input.close();
	}

}
