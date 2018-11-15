
public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] twoDArray = new int [3][5];
		
		// number of lines
		//System.out.println(twoDArray[0].lenght);
		//number of columns
		//System.out.println(twoDArray[0].length);
		int arrayValue = 1;
		for (int i =0;i <twoDArray.length;i++)
		for(int j =0;j <twoDArray[i].length;j++) {
			twoDArray[i][j] = arrayValue;
			arrayValue++;
		}

 for (int i =0; i< twoDArray.length;i++) {
	 for(int j=0; j<twoDArray.length;j++) {
		 System.out.print(twoDArray[i][j]);
		 if (j==twoDArray[i].length - 1)
			 System.out.print("\n");
		 else
			 System.out.print(",");
	 }
 }
	}
}

