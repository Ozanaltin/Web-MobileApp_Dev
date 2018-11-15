
public class labq4 {
	private String name;
	private String gender;
	private String idNum;
	private int age;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getIdNum() {
		return idNum;
	}
	public String getGender() {
		return gender;
	}
	public void setAge( int newAge) {
        age = newAge;  
    }
	public void setGender( String newGender) {
        gender = newGender;  
    }
	public void setName(String newName) {
		name = newName;
	}
	public void setIdNum( String newId) {
		idNum=newId;
	}
	  System.out.println(age);
}


