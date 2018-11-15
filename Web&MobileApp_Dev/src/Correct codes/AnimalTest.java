
public class AnimalTest extends Animal {
    public static void main(String args[]) {
	Animal animal = new Animal();
    Fish fish = new Fish();
    Dog dog = new Dog();
    Cat cat = new Cat();
    
    System.out.println();
    
    animal.sleep();
    animal.eat();
    fish.sleep();
    fish.eat();
    dog.sleep();
    dog.eat();
    cat.sleep();
    cat.eat();
		 
	}
}

