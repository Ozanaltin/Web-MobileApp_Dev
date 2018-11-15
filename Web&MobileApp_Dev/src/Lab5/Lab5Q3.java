package Lab5;
import java.util.Scanner;
public class Lab5Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number");
        int Input1 = input.nextInt();
        System.out.print("Enter second number");
        int Input2 = input.nextInt();
        System.out.print("Enter third number");
        int Input3 = input.nextInt();
        
        if(Input1<Input2&&Input2<Input3) {
        	System.out.print("Increasing in order");}
        if(Input1>Input2&&Input2>Input3) {
        	System.out.print("Decreasing in order");}
        else 
        		if((Input1<Input2&&Input2>Input3)||(Input1>Input2&&Input2<Input3)||(Input1==Input2&&Input2==Input3))
        	{
        		System.out.print("Neither increasing or decreasing order");}
        }}
