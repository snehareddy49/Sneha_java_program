package java_project;

import java.util.Scanner;

public class Practi {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter income");
        long a = sc.nextLong();
        if (a>500000) {
            System.out.println("0%");
        }
        else if((a==500000)||(a<1000000)) {
            System.out.println("20%");
        }
        else if (a>1000000) {
            System.out.println("30%");
        }
        else {
            System.out.println("Invalid input");
        }
        }
}
