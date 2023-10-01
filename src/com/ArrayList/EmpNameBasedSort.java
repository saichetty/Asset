package com.ArrayList;

import java.util.Comparator;

public class EmpNameBasedSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}
