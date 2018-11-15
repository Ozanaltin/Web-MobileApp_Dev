	import java.util.Scanner;
	public class factorial {
		public static void main (String[] args){
			Scanner input= new Scanner (System.in);
			int factorial,total =1;
			System.out.println("Enter a number");
			int number=input.nextInt();
			factorial = number;
			if (number > 0) {
		    for (int counter = 1;number > counter; counter++) {
				total += total * (factorial - 1);
				factorial--;}}
			else {
				System.out.println("Enter a proper number");}
			}
			System.out.println( number + "!=" + total);
			}
				
	
		
	
	
