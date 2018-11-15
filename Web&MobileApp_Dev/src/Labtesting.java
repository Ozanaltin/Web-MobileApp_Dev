import java.util.Scanner;
public class Labtesting {
    public static void main (String[]args){//start of main method
        Scanner input = new Scanner (System.in);//allow for user input
        System.out.println("Please enter the first integer: ");//prompt
        int a = input.nextInt();//initial user input
        System.out.println("Please enter a second interger: ");//prompt
        int b = input.nextInt();//second user input


       Divide(a,b);//call method
    }
   public static void Divide(int a, int b) {//start of your method

    int temp;
    // making a greater than b
    if (b > a) {
         temp = a;
         a = b;
         b = temp;
    }

    while (b !=0) {
        // gcd of b and a%b
        temp = a%b;
        // always make a greater than b
        a =b;
        b =temp;

    }
    System.out.println(a);//print to console
  }
}