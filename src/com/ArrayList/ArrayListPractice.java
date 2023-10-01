package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListPractice {
	
//	searching and sorting
	
		public static void main(String[] args ) {
		

		Department d1 = new Department("software");
		Department d2 = new Department("finance");
		Department d3 = new Department("Human resource");
		Department d4 = new Department("technical");
		Department d5 = new Department("it");
		
		Employee e1 = new Employee(100,"saikumar",50000.00 ,d1, "software engineer");
		Employee e2 = new Employee(102,"ch sai",60000.00 ,d2, "manager");
		Employee e3 = new Employee(101,"praneeth",70000.00 ,d4, "asst software engineer");
		Employee e4 = new Employee(104,"pradeep",80000.00 ,d5, "hr engineer");
		Employee e5 = new Employee(103,"kumar",90000.00 ,d3, "Asst. manager");
		Employee e6 = new Employee(106,"cheepirichetti",60000.00 ,d2, "manager");
		Employee e7 = new Employee(107,"suresh",50000.00 ,d1, "software engineer");
		
		ArrayList<Employee> empData = new ArrayList<>();
		
		empData.add(e2);
		empData.add(e5);
		empData.add(e4);
		empData.add(e3);
		empData.add(e1);
		empData.add(e7);
		empData.add(e6);
		empData.add(e5);
		
		
//		Collections.sort(empData, new Comparator<Employee>() {
//
//			
////		Name based sorting
//			
////		public int compare(Employee o1, Employee o2) {
////		return o1.getEmpName().compareTo(o2.getEmpName());
////			}
////
////		});
//	  
//		
//		
////			ID based sorting
//			public int compare(Employee o1, Employee o2) {		
//			return o1.getEmpId()-(o2.getEmpId());
//		}
//	});
	
		System.out.println("11111111111111111111111");
		Iterator<Employee> itr = empData.iterator();
		while(itr.hasNext()) {
			Employee empl = itr.next();
//		if(empl.getEmpName().startsWith("p")) {
			if(empl.getEmpDepartment().getDeptName().contains("Human resource")) {
			System.out.println("HR dept: "+empl);
			}System.out.println("   ");
		
			if(empl.getEmpDesignition().contentEquals("manager")) {
				System.out.println("Manager designition: "+empl);
			}System.out.println("   ");
			System.out.println("   ");
			if(empl.getEmpDepartment().getDeptName().equalsIgnoreCase("SOFTWARE")) {
				System.out.println("SEARCH BY CAPITAL LETTERS: "+ empl);
			}System.out.println("   ");
			System.out.println("   ");
			
			if(empl.getEmpSalary()>=40000.00 && empl.getEmpSalary()<=50000.00 ) {
				System.out.println("The salary B/w 40k to 50k are: "+empl.getEmpName());
			}
		
		}
			
//		System.out.println("22222222222222222222222");
//		for(int i=0; i<empData.size();i++) {
//			System.out.println(empData.get(i));
//		}
		
//		System.out.println("33333333333333333333");
//		empData.forEach(System.out::println);
//		System.out.println("444444444444444444444444");
//		for (Employee employee : empData) {
//			System.out.println(employee);
//		}
	}
}

