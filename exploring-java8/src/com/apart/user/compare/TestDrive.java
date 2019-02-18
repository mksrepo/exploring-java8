package com.apart.user.compare;

import java.util.ArrayList;
import java.util.List;

import com.apart.pojo.Student;

public class TestDrive {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student(5, "Sachin"));
		students.add(new Student(4, "Sourav"));
		students.add(new Student(2, "Sunil"));
		students.add(new Student(1, "Kohli"));

		students.sort(StudentComparator::rollComparator);

		System.out.println(students);
	}
}
