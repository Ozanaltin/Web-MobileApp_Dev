import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
public class Quiz4Tester {
	 public static void main(String args[]) {
		int randomizer = (int)Math.round((Math.random()*32) + 1);
		int randomizer2 = (int)Math.round((Math.random()*32) + 1);
		int randomizer3 = (int)Math.round((Math.random()*32) + 1);
		int randomizer4 = (int)Math.round((Math.random()*32) + 1);
	      /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(	1,	"	Uruguay	"	);
	      hmap.put(	2,	"	Russia	"	);
	      hmap.put(	3,	"	Saudi Arabia");
	      hmap.put(	4,	"	Egypt	"	);
	      hmap.put(	5,	"	Spain	"	);
	      hmap.put(	6,	"	Portugal"	);
	      hmap.put(	7,	"	Iran	"	);
	      hmap.put(	8,	"	Morocco	"	);
	      hmap.put(	9,	"	France	"	);
	      hmap.put(	10,	"	Denmark	"	);
	      hmap.put(	11,	"	Peru	"	);
	      hmap.put(	12,	"	Australia"  );
	      hmap.put(	13,	"	Croatia"	);
	      hmap.put(	14,	"	Argentina"  );
	      hmap.put(	15,	"	Nigeria	"	);
	      hmap.put(	16,	"	Iceland	"	);
	      hmap.put(	17,	"	Brazil	"	);
	      hmap.put(	18,	"	Switzerland ");
	      hmap.put(	19,	"	Serbia	"	);
	      hmap.put(	20,	"	Costa Rica ");
	      hmap.put(	21,	"	Sweden	"	);
	      hmap.put(	22,	"	Mexico	"	);
	      hmap.put(	23,	"	South Korea");
	      hmap.put(	24,	"	Germany	"	);
	      hmap.put(	25,	"	Belgium	"	);
	      hmap.put(	26,	"	England	"	);
	      hmap.put(	27,	"	Tunisia	"	);
	      hmap.put(	28,	"	Panama	"	);
	      hmap.put(	29,	"	Colombia"	);
	      hmap.put(	30,	"	Japan	"	);
	      hmap.put(	31,	"	Senegal	"	);
	      hmap.put(	32,	"	Poland	"	);
	      hmap.put(	31,	"	Senegal	"	);
	      hmap.put(	32,	"	Poland	"	);
	      
		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(hmap.entrySet());
		for (Map.Entry<Integer, String> entry : list) {

                if (entry.getKey()==randomizer) {
				System.out.print(entry.getKey());
				System.out.println(entry.getValue());}
                if (entry.getKey()==randomizer2) {
				System.out.print(entry.getKey());
				System.out.println(entry.getValue());}
                if (entry.getKey()==randomizer3) {
				System.out.print(entry.getKey());
				System.out.println(entry.getValue());}
                if (entry.getKey()==randomizer4) {
				System.out.print(entry.getKey());
				System.out.println(entry.getValue());}
			
		
	 }}}         