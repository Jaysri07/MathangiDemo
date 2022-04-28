package org.emp;

public class Employee {
	private void empId() {
		// TODO Auto-generated method stub
		System.out.println("12345");
	}
	private void empName() {
		// TODO Auto-generated method stub
		System.out.println("Jayasri");
	}
	private void empDob() {
		// TODO Auto-generated method stub
		System.out.println("07-06-1993");
	}
	private void empPhone() {
		// TODO Auto-generated method stub
		System.out.println("9876543210");
	}
	private void empEmail() {
		// TODO Auto-generated method stub
		System.out.println("happy@gmail.com");
	}
	private void empAddress() {
		// TODO Auto-generated method stub
		System.out.println("123, abc street");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.empId();
		e.empName();
		e.empDob();
		e.empAddress();
		e.empEmail();
		e.empPhone();
	}
}
