package java_project;
class employee {
	private String name;
	private long id;
	private long salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	
}





public class task9 {

	public static void main(String[] args) {
		employee obj = new employee();
		obj.setName("sneha");
		obj.setId(01);
		obj.setSalary(30000);
		System.out.println( "Name " + obj.getName()+"  id"+" "+obj.getId()+"  "+ "  salary "+obj.getSalary());

	}

}
