package oops;

public class OopsMain {
	public static void main(String[] args) {
		Animal animal1= new Animal("Dog",2,"Land");
		animal1.sleep();
		animal1.eat();
		animal1.setName("Labrador");
		System.out.println(animal1.getName());
		System.out.println(animal1.getAge());
		System.out.println(animal1.getHabitat());
	}
}
