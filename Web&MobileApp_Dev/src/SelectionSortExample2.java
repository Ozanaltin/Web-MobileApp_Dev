
public class SelectionSortExample2 {
	public static void main(String a[]) {
	int[] arr1= {9,14,3,2,43,11,58,22};
	System.out.println("Before Selection Sort");
	for (int i:arr1) {
		System.out.print(i+" ");
		}
	System.out.println();
    
	selectionSort(arr1);
	//sorting array using selection sort
	System.out.println("After Selection Sort");
	for (int i:arr1) {
		System.out.print(i+" ");
	}
}}
