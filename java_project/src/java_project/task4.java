package java_project;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in); // Create a Scanner object
	        System.out.print("Enter your name: ");    // Prompt the user
	        String name = scanner.nextLine();         // Read user input
	        System.out.println( name.toUpperCase()); 
	        scanner.close();
		
	}
}
