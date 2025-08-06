package java_project;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		try {
			int x = 2/0 ;
		} catch( Exception e) {
			System.out.println("you cant / by 0");
		}finally {
			System.out.println();
		}
	}

}
