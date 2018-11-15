import java.util.Scanner;
public class Labtesting3 {
	public static void main(String[] args) {

	
	 static int gcd(int a, int b)
	    {
		 
	        // Everything divides 0 
	        if (a == 0 || b == 0)
	           return 0;

	        // base case
	        if (a == b)
	            return a;

	        // a is greater
	        if (a > b)
	            return gcd(a-b, b);
	        return gcd(a, b-a);
	    }
	 

	    // Driver method
	    public static void main(String[] args) 
	    {
	    
	        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
	    }
	}}

Scanner input = new Scanner(System.in);
System.out.print("Enter number 1 ");
int a = input.nextInt();
Scanner input = new Scanner(System.in);
System.out.print("Enter number 2 ");
int b = input.nextInt();