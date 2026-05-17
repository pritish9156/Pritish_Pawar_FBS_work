package services;

import java.util.ArrayList;

import models.Student;

public interface StudentServiceInterface {

	boolean insertStudent(Student stud);
	ArrayList<Student> viewStudent();
	Student searchStudent(int id);
	Boolean updateFeesPaid(int id, double fees);
	Boolean removeStudent(int id);
	
}
