package java_project; 
class parent {
	void car() {
		System.out.println("Bmw");
	}
}
class Son extends parent {
	void car () {
		super.car();
		System.out.println("G-wagon");
		
	}
	
}
public class Child_java {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.car();
		
	}
}
