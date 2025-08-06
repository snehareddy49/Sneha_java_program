package java_project;
class Animals{
	void eat() {
		System.out.println("animal eats");
		
	}
}
class Dog extends Animals{
	void eat() {
		System.out.println("eats meat");
	}
}

class Puppy extends Animals{
	void eat() {
		System.out.println("drinks milk");
	}
}






public class TTask6 {

	public static void main(String[] args) {
		Animals a = new Animals();
		Animals b = new Dog();
		Animals c = new Puppy();
		a.eat();
		b.eat();
		c.eat();
		
		

	}

}
