package dao;

import java.util.ArrayList;

import models.Student;

public interface StudentDAOInterface {

	void addStudent(Student s);
	ArrayList<Student> getAllStudent();
	Student searchStudentById(int id);
	Boolean updateFees(int id, double fees);
	Boolean deleteStudent(int id);
	
}
