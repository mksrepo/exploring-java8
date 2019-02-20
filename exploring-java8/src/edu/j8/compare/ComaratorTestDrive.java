package edu.j8.compare;

import java.util.ArrayList;
import java.util.List;

import edu.j8.pojo.Student;

public class ComaratorTestDrive {

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
