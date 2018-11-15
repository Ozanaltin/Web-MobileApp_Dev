	import java.util.HashMap;
	import java.util.Map;
	import java.util.Iterator;
	import java.util.Set;
public class Lab4Q2 {
	   public static void main(String args[]) {
       
	      /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(98762,"Steve Jackson");
	      hmap.put(96754,"Miles Murden");
	      hmap.put(92345,"Daren Deland");
	      hmap.put(99998,"Stephen Stander");
	      hmap.put(91235,"Mitchell Major");
	      hmap.put(98745,"Nestor Nicely");
	      hmap.put(96534,"Autumn Fall");
	      hmap.put(90987,"Lazaro Layden");
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print(mentry.getKey()+" ");
	         System.out.println(mentry.getValue());
}
	      hmap.put(90666, "Larry King");
	      System.out.println("New Set of Keys: ");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry = (Map.Entry)iterator2.next();
		         System.out.print(mentry.getKey()+" ");
		         System.out.println(mentry.getValue());
	       }
}}
