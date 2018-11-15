


 import java.util.Scanner;
 public class LabLotto{
 public static void main (String [] args) {
 // Generate a lottery number
 int lottery = (int)(Math.random()*1000);
 
 
 // Prompt the user to enter a guess
 Scanner input = new Scanner(System.in);
 System.out.print("Enter your lottery pick (three digits): ");
 int guess = input.nextInt();
 
 

 // Get digits from lottery
 int lotteryDigit1 = lottery / 100;
 int lotteryDigit2 = lottery % 100/10;
 int lotteryDigit3 = lottery %10;
 int []lotteryarray =  {lotteryDigit1, lotteryDigit2, lotteryDigit3};
 // Get digits from guess
 int guessDigit1 = guess / 100;
 int guessDigit2 = guess % 100/10;
 int guessDigit3 = guess %10;
 int []guessArray =  {guessDigit1, guessDigit2, guessDigit3};
 System.out.println("Lottery Number is :"+lottery);
	  int counter = 0;
  for (int i = 0; i <= 2; i++){

	     for ( int x =0;x <= 2;){
	    	 
	         if (guessArray[x] == lotteryarray[i]){
	        	 counter++;
	           }
	         x++;
	              }	    
  }                 
 if (guessArray[0] == lotteryarray[0] && guessArray[1] == lotteryarray[1] && guessArray[2] == lotteryarray[2]) {
 System.out.println("SUPER PRIZE WINNER: $100,000!!");}
 else if (counter == 3){
    System.out.println("Match: you win $10,000");}
 else if (counter >= 1 && counter < 3){
    System.out.println("GOOD PRIZE WINNER: $1,000!!");}
 else{
    	System.out.println("nothing");}
}}