package java_project;

public class Mythread extends Thread{
	public void run() {
		for(int j=1 ; j<=5 ;j++) {
			System.out.println("thread running" + j);
			try {
				Thread.sleep(2006);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		Mythread m = new Mythread();
		m.start();
	}

}
