import java.util.Scanner;
public class prime {
	public static void main (String[] args){
		Scanner input= new Scanner (System.in);
		System.out.println("Enter a Number");
		int num=input.nextInt();
		//switch (num) {
        //case 1:  num = 1;
           //System.out.println("This isn't a prime number");}
		//break;
		//case 2: num != 1;
		if (num %2!= 0) {
			System.out.println("This is a prime number");}
		else {
			System.out.println("This isn't a prime number");}
		//break;
		}
	}


