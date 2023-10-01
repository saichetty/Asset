package com.ArrayList;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private  Department empDepartment;
	private String empDesignition;
	
	public void Employee() {
		
	}
	
	
	
	public Employee(int empId, String empName, double empSalary, Department empDepartment, String empDesignition) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDepartment = empDepartment;
		this.empDesignition = empDesignition;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public double getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}



	public Department getEmpDepartment() {
		return empDepartment;
	}



	public void setEmpDepartment(Department empDepartment) {
		this.empDepartment = empDepartment;
	}



	public String getEmpDesignition() {
		return empDesignition;
	}



	public void setEmpDesignition(String empDesignition) {
		this.empDesignition = empDesignition;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDepartment="
				+ empDepartment + ", empDesignition=" + empDesignition + "]";
	}



		public static void main(String[] args) {
	

	
		Department d1 = new Department("software");
		Department d2 = new Department("finance");
		Department d3 = new Department("Human resource");
		Department d4 = new Department("technical");
		Department d5 = new Department("it");
		
		
		Employee e1 = new Employee(100,"Saikumar",50000.00 ,d1, "software engineer");
		Employee e2 = new Employee(102,"ch sai",60000.00 ,d2, "manager");
		Employee e3 = new Employee(101,"praneeth",70000.00 ,d4, "asst software engineer");
		Employee e4 = new Employee(104,"pradeep",80000.00 ,d5, "hr engineer");
		Employee e5 = new Employee(103,"kumar",90000.00 ,d3, "Asst. manager");
	

System.out.println(e1);

}
	
}
