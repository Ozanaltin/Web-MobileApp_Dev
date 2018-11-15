import java.util.Arrays;
public class FastestRunner {

		public static void main (String[] arguments) {
		String[] names = {
		"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
		"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
		"Aaron", "Kate"
		};
		int[] times = {
		341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
		343, 317, 265
		};
		int max=0;
		//for (int i = 0; i < names.length; i++) {
		//System.out.println(names[times.length-i] + ": " + times[times.length-i]);
		//}
		//Arrays.sort(times);
		for (int i = 0; i < names.length; i++) { 
            if (times[i] > times[max]) { //Checking the minimum value out of 16 elements
                max = i;
            }
			
			    
		}
		System.out.println(names[max] + ": " + times[max]);
}}
