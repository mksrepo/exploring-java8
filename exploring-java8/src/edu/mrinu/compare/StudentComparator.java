package edu.mrinu.compare;

import edu.mrinu.pojo.Student;

public class StudentComparator {

	public static int nameComparator(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
	}

	public static int rollComparator(Student student1, Student student2) {
		return student1.getRollNo() == student2.getRollNo() ? 0 : student1.getRollNo() > student2.getRollNo() ? +1 : -1;
	}
}
