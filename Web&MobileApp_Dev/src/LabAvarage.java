import java.util.Scanner;

public class LabAvarage {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of subjects ");
		int subjects = input.nextInt();
		int grade[] = new int[subjects];
		int y=0;
		int gradesum=0;
		for (int x =0;x < subjects;x++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter mark " +(x +1)+":");
			grade[x]=Integer.parseInt(scan.nextLine());
		}
		for (int x=0;x<subjects;x++) {
			System.out.println(grade[x]);
		}
		for (int x=0;x<subjects;x++) {
			gradesum += grade[x];
			
		}
		System.out.print("Avarage of (");
		for (int x=0;x<=subjects-2;x++) {
			System.out.print(+grade[x]+",");
		    y = x+1;		
		}
		if ( y == subjects-1 ) {
			System.out.print(+grade[y]);
		}
		System.out.println(")="+gradesum/subjects);
	}

}
