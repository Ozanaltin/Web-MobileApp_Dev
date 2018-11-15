public class ArrayCommonElements {
	public static void main (String [] args) {
	int [] A={1, 2, 5, 5, 8, 9, 7, 10, 12, 14};
	int [] B={1, 0, 6, 15, 6, 4, 7, 0, 12, 15};
	for (int i=0;i<A.length;i++) {
		for(int l=0;l<B.length;l++) {
			if(A[i]==B[l]) {
				
				System.out.println(A[i]);
				}
			}
		}
		
		
}
}

