package java_project;

class Student{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
}




public class SimpleEncapsulation {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("  sneha  ");
		obj.setAge(18);
		
		System.out.println( "Name" + obj.getName()+"age"+" "+obj.getAge());

	}

}
