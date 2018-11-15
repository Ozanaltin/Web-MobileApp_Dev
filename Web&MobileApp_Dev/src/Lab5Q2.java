import java.util.Scanner;
	    
public class Lab5Q2 {
	public static void main(String[] args) {
		int counter=0;
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a word or sentence");
	        String s = input.nextLine();
	        char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
	        for(int i=0;i<s.length()-1;) {
	        	for (int z=0;z<vowels.length;) {   		
	        	if(s.charAt(i)== vowels[z]) {
	        		counter++;
	        	}
	        	z++;
	        }
	        i++;}
	        System.out.println("Number of vowels for entered text is:"+counter);
	

}}
