package java_project;
class person {
	String name= "sneha";
	int age = 19;
}

class student5 extends person {
	int rollNo = 24 ;
	
	void displayDetails() {
		System.out.println("name:"+"  "+ name);
		System.out.println("age:"+" " +age);
		System.out.println("rollno:" + rollNo);
	}	
	
	public class task14 {
		public static void main(String[] args) {
			student5 snh = new student5();
			snh.displayDetails();
		}
	}
}
