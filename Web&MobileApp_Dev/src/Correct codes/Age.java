import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Enter your age");
		int age=input.nextInt();
		if (age > 70) {
			System.out.println("You are too old to study java");}
		else if (age > 60) {
			System.out.println("You still can study java");}
		else if (age > 50) {
			System.out.println("You can be a master of java");}
		else if (age > 40) {
			System.out.println("You can be a instructor of java");}
		else if (age > 20) {
			System.out.println("Don't study, get married first");}
		else {
			System.out.println("Grow up more");}
		}
	}


