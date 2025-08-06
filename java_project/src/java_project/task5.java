package java_project;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		System.out.println("enter sentence");
		Scanner sc = new Scanner(System.in);
		String senty = sc.nextLine();
		System.out.println(senty.length());
		sc.close();
	}

}
