package sample.interfaceClass.example.programs;

import java.util.Scanner;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the student name : ");
		String name = scan.nextLine();
		System.out.println("enter the student place : ");
		String place = scan.nextLine();
		System.out.println("enter the student email : ");
		String email = scan.nextLine();
		System.out.println("enter the password : ");
		String pwd = scan.nextLine();
		System.out.println("eneter employee name : ");
		String empname = scan.nextLine();
		System.out.println("enter the emp place : ");
		String ePlace = scan.nextLine();
		System.out.println("enter the emp age : ");
		int eAge = scan.nextInt();
		System.out.println("enter the age of the student : ");
		int age = scan.nextInt();
		System.out.println();
		
		
		Employee emp = new Employee();
		emp.stuDetails(name, age, place);
		System.out.println();
		emp.gmailAccount(email, pwd);
		System.out.println();
		emp.empDetails(empname, eAge, ePlace);
	}

}
