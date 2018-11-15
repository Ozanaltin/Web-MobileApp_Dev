import java.io.IOException;
public class WriteDataLab {
	public static void main(String [] args) throws IOException{
		
		double John[]= {89.3,78.9,80.6};
		double Eric[]= {89.9,78.7,90.2};
		double Steve[]= {95.6,90.3,92.4};
		java.io.File file = new java.io.File("test.txt");
		if (file.exists()) {
			System.out.println("File exist");
			System.exit(1);
		}
		//Create a file 
		java.io.PrintWriter output =new java.io.PrintWriter(file);
		//Write formatted output to the file
			output.print("John ");
			output.print(John[0]);
			output.print(" "+John[1]);
			output.println(" "+John[2]);
			output.print("Eric ");
			output.print(Eric[0]);
			output.print(" "+Eric[1]);
			output.println(" "+Eric[2]);
			output.print("Steve ");
			output.print(Steve[0]);
			output.print(" "+Steve[1]);
			output.println(" "+Steve[2]);
		//Close File
		output.close();
}
}


