package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {

		Student s = new Student();
		String collegeName = s.collegeName("Sairam Eng college");
		int collegeCode = s.collegeCode(111);
		int collegeRank = s.collegeRank(5);
		System.out.println("I studied in " + collegeName + " with CollegeCode as " + collegeCode
				+ " and CollegeRank as " + collegeRank);
		String department = s.deptName("Electronics and Instrumentation");
		System.out.println("Department name is " + department);
		String studentNm = s.studentName("Vijayalakshmi");
		System.out.println(studentNm);
		int studentId = s.studentId(1234);
		System.out.println(studentId);
		String studentDept = s.studentDept("EIE");
		System.out.println(studentDept);
	}

	public String studentName(String a) {
		return a;
	}

	public String studentDept(String b) {
		return b;
	}

	public int studentId(int c) {
		return c;
	}

}
