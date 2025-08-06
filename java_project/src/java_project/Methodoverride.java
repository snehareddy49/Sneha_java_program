package java_project;

class Animal {
	public void sound() {
		System.out.println("Animal makes Sound");
	}
}

class Cats extends Animal {
	public void sound() {
	System.out.println("meow");
}
}
public class Methodoverride {
	public static void main(String[] args) {
		Animal obj = new Cats();
		obj.sound();
	}
	

}
