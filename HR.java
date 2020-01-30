package sample.example.corejava;

import java.util.Scanner;

public class HR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name : ");
		String name = scan.nextLine();
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.getName();
	}

}
