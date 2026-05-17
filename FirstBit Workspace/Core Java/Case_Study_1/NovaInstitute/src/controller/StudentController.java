package controller;

import java.util.ArrayList;

import models.Student;
import services.StudentServiceInterface;

public class StudentController {
	
	StudentServiceInterface studServiceImpl;
	
	public StudentController(StudentServiceInterface studServiceImpl) {
		this.studServiceImpl = studServiceImpl;
	}

	public boolean insertStudent(Student stud) {
		return studServiceImpl.insertStudent(stud);
	}

	public ArrayList<Student> viewStudent() {
		return studServiceImpl.viewStudent();
	}

	public Student searchStudent(int id) {
		return studServiceImpl.searchStudent(id);
	}

	public Boolean updateFeesPaid(int id, double fees) {
		return studServiceImpl.updateFeesPaid(id, fees);
	}

	public Boolean removeStudent(int id) {
		return studServiceImpl.removeStudent(id);	
	}
}
