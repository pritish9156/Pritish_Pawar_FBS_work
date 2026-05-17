package serviceImplementation;

import java.util.ArrayList;

import dao.StudentDAOInterface;
import models.Student;
import services.StudentServiceInterface;

public class StudentServiceImpl implements StudentServiceInterface{
	
	StudentDAOInterface studDAOImpl;

	public StudentServiceImpl(StudentDAOInterface studDAOImpl) {
		this.studDAOImpl = studDAOImpl;
	}

	@Override
	public boolean insertStudent(Student stud) {
		return studDAOImpl.addStudent(stud);
	}

	@Override
	public ArrayList<Student> viewStudent() {
		return studDAOImpl.getAllStudent();
	}

	@Override
	public Student searchStudent(int id) {
		return studDAOImpl.searchStudentById(id);
	}

	@Override
	public Boolean updateFeesPaid(int id, double fees) {
		return studDAOImpl.updateFees(id, fees);
	}

	@Override
	public Boolean removeStudent(int id) {
		return studDAOImpl.deleteStudent(id);	
	}

}
