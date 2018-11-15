
public class Labarray {
	public static void main(String[] args) {
		int [] mylist = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for (int i = 0; i < mylist.length ; i++) { 
		    System.out.print(mylist[i]+" ");
		    if ( i == 4 ) { 
		    	System.out.println();
		   	}
		    if ( i == 9 ) { 
		    	System.out.println();
		    }
		}

	}
}
