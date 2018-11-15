import java.util.Scanner;
public class Sphere {
	public static void main (String[] args){
		
		Scanner input= new Scanner (System.in);
		System.out.println("Enter diameter");
		double diameter=input.nextDouble();
		double radius = diameter / 2;
		double area =  Math.PI * radius * radius;
	    double peri = 2 * radius * Math.PI;
	    System.out.println("Radius:"+radius);
	    System.out.println("Area:"+area);
	    System.out.println("Pari:"+peri);
	}

}
