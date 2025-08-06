package java_project;

class car {
	String color;
	String wheels; 
	
	public void drive() {
		System.out.println("driving car");
	}
		public void printColor() {
			System.out.println("this.color");
		}
		
}

public class humans {
	public static void main(String[] args) {
		car car1 = new car();
		car1.color="red";
		car1.wheels="3";
		
		car car2 = new car();
		car2.color="blue";
		car2.wheels="9";
		
	}
}
