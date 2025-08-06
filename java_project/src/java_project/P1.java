package java_project;
 class Pen {
	 String color;
	 String type;
	 
	 public void write() {
		 System.err.println("writing");
	 }
	 
	 public void printColor() {
		 System.err.println(this.color);
	 }
 }

public class P1 {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color="blue";
		pen1.type="gel";
		
		Pen pen2 = new Pen();
		pen2.color="bluee";
		pen2.type="gely";
		
		pen1.printColor();
		pen2.printColor();
		
	}
	
     
}
