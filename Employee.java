package sample.interfaceClass.example.programs;

public class Employee implements Nameable , Student{

	@Override
	public void gmailAccount(String email, String password) {
		System.out.println("student email : "+email);
		System.out.println("password is : ");
	}

	@Override
	public void stuDetails(String name, int age, String place) {
		System.out.println("Student name : "+name);
		System.out.println("age : "+age);
		System.out.println("place : "+place);		
	}

	@Override
	public void empDetails(String name, int age, String place) {
		System.out.println("employee name : "+name);
		System.out.println("age : "+age);
		System.out.println("place : "+place);	
	}
}
