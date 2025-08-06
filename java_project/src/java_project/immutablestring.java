package java_project;

public class immutablestring {
  String name = "Sneha";
  
  public void print() {
	  System.out.println(name);
	  System.out.println(name.concat(""+"Reddy"));
  }
  public static void main(String[] args) {
	immutablestring obj = new immutablestring();
	obj.print();
}
}
