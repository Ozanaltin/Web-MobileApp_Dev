
public class ArraySample {
	
	public static void main(String[] args) {
		double [] mylist = {1.5, 3.9, 4.4, 3.5};
		
		//Print all the array elements
		for (int i = 0; i < mylist.length ; i++) {
		    System.out.println(mylist[i]+" ");
		   	}
		
		//Summing all elements
		double total = 0;
		for (int i = 0; i< mylist.length; i++) {
			total += mylist[i];
		}
		System.out.println("Total is " + total);
		
		//Finding the largest element
		double max = mylist[0];
		for ( int i=1; i < mylist.length; i++) {
			if(mylist[i] > max) max = mylist[i];
		}
		System.out.println("Max is " + max);
	}
}
		
