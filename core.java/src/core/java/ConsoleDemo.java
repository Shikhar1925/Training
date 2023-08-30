package core.java;

import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = console.nextLine();
		
		System.out.println("Enter your age: ");
		int age = console.nextInt();
		System.out.print(age);
		System.out.println("Your Name: "+ name);

	}

}
