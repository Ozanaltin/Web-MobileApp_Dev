
public class MScStudent2 extends Student implements LifeStyle{
	private String supervisor;
	MScStudent2(String nm){
		super(nm);
	}
	
	public void haveGoodFood() {
		System.out.println("Lost of bread,meat and veg");
		}
	public void haveAccommodation() {
		System.out.println("have a single room in a shared house");
		}
	
	public static void main(String[] args) {
		MScStudent2 m1= new MScStudent2("Mike");
		m1.haveGoodFood();
		
		MScStudent2 m2= new MScStudent2("Mike");
		m2.haveAccommodation();
		
	}

}
