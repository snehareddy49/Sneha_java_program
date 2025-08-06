package java_project;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
	try {	
	
	Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int number1 = sc.nextInt();
    System.out.println("enter number");
    int number2 = sc.nextInt();
    sc.close();
    
    int result = number1/number2;
    System.out.println("result"+result);
	} catch(Exception e) {
		System.out.println("sorry can't divide by 0");
	}
	}
}
