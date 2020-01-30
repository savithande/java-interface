package sample.example.corejava;

public class Employee implements Nameable {

	@Override
	public void setName(String name) {
		System.out.println("the name is : "+name);
	}

	@Override
	public void getName() {
		System.out.println("get the naem from user");
	}
	

}
