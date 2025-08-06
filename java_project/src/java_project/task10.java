package java_project;


class Print {
 public void print() {
     System.out.println("Printing ");
 	}
}


class InkjetPrinter extends Print {
 
 public void print() {
     System.out.println("Inkjet Printer");
 	}
}


class LaserPrinter extends Print {

 public void print() {
     System.out.println("Laser Printer");
 }
}


public class task10 {
	public static void main(String[] args) {
     

	 Print obj = new InkjetPrinter(); 
	 obj.print();
	 Print obj1 = new LaserPrinter();
	 obj1.print();
	 
                
 }
}