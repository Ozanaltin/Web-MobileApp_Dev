import java.util.ArrayList;
public class Season {
	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
        
		mylist.add("Spring");
		mylist.add("Summer");
		mylist.add("Fall");
		mylist.add("Winter");
        System.out.println(mylist);
		mylist.remove(2);
		mylist.add(2,"Autumn");
		System.out.println(mylist);
}
}