
public class quiztemp {/** A class that sorts an array of Integer objects from
	* largest to smallest using a selection sort.
	*/
    private Integer[] a;
	public quiztemp(Integer[] arr){
	 a = arr; 
	}

	/** Swap a[i] and a[j] in array a. */
	private void swap(int i, int j){ 
	/* implementation not shown */ 
	}

	/** Sort array a from largest to smallest using selection sort.
	* Precondition: a is an array of Integer objects.
	*/
	public void selectionSort(){
	for (int i = 0; i < a.length - 1; i++){
	//find max element in a[i+1] to a[n-1]
	Integer max = a[i];
	int maxPos = i;
	for (int j = i + 1; j < a.length; j++) {
	if (max.compareTo(a[j]) < 0) //max less than a[j]{
	max = a[j];
	maxPos = j;
	}
	swap(i, maxPos); //swap a[i] and a[maxPos]
	System.out.println(maxPos + " " +max);
	}
	
	}
	
}
	



