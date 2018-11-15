import java.util.Scanner;
public class ShowLogicErrors{ 
public static void main (String[] args) {
	int celsius;
	Scanner input= new Scanner (System.in);
	System.out.println("Enter a celsius");
	celsius=input.nextInt();
	System.out.println(celsius * 9/5+32);
}
}

