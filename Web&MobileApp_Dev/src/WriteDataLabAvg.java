import java.io.IOException;
public class WriteDataLabAvg {
		public static void main(String [] args) throws IOException{
			double John[]= {89.3,78.9,80.6};
			double Eric[]= {89.9,78.7,90.2};
			double Steve[]= {95.6,90.3,92.4};
			java.io.File file = new java.io.File("testavg.txt");
			if (file.exists()) {
				System.out.println("File exist");
				System.exit(1);
			}
			//Create a file 
			java.io.PrintWriter output =new java.io.PrintWriter(file);
			//Write formatted output to the file
			output.print("Student Name: John ");
			output.println(John[0]+" "+John[1]+" "+John[2]);
			output.println("Avarage test score "+(John[0]+John[1]+John[2])/John.length);
			output.print("Student Name: Eric");
			output.println(Eric[0]+" "+Eric[1]+" "+Eric[2]);
			output.println("Avarage test score "+(Eric[0]+Eric[1]+Eric[2])/Eric.length);
			output.print("Student Name: Steve");
			output.println(Steve[0]+" "+Steve[1]+" "+Steve[2]);
			output.println("Avarage test score "+(Steve[0]+Steve[1]+Steve[2])/Steve.length);
			//Close File
			output.close();
		}

	}

