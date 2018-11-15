import java.util.Scanner;
public class Gregoriam_leibniz {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Enter a number");
		int seq=input.nextInt();
		double number = 0;
		for (int i = 0; i< seq; i++)
		if ( i%2== 0) {
			number = number + 4.0 / ( i * 2 + 1);}
		else {
			number = number - 4.0 /( i * 2 + 1);}
		System.out.println(number);
		}
	}


