package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBUtil;

public class DataBaseDAO {
	
	static public void createTables() {

		Connection con = DBUtil.getConnection();
		
		try {
			
			String studentTable = "create table if not exists student(student_id int primary key, "
							+ "name varchar(30) not null, "
							+ "email varchar(30) unique, "
							+ "city varchar(30), "
							+ "age int check(age >= 18), "
							+ "fees_paid decimal(10,2))";

			String trainerTable = "CREATE TABLE IF NOT EXISTS trainer ("
									+ "trainer_id INT PRIMARY KEY AUTO_INCREMENT, "
									+ "trainer_name VARCHAR(100), "
									+ "mobile_number VARCHAR(15), "
									+ "email VARCHAR(100), "
									+ "city VARCHAR(100), "
									+ "qualification VARCHAR(100), "
									+ "specialization VARCHAR(100), "
									+ "experience_years INT"
									+ ")";
			
			String courseTable = "create table if not exists course(course_id int primary key, "
							+ "cname varchar(30) not null, "
							+ "duration varchar(30), "
							+ "fees decimal(10,2))";

			String batchTable = "CREATE TABLE IF NOT EXISTS batch_table ("
					+ "batch_id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "batch_name VARCHAR(100), "
					+ "start_date DATE, "
					+ "end_date DATE, "
					+ "course_id INT, "
					+ "FOREIGN KEY(course_id) REFERENCES course(course_id)"
					+ ")";

			String enrollmentTable = "CREATE TABLE IF NOT EXISTS enrollment ("
					+ "enrollment_id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "student_id INT, "
					+ "course_id INT, "
					+ "batch_id INT, "
					+ "enrollment_date DATE, "
					+ "FOREIGN KEY(student_id) REFERENCES student(student_id), "
					+ "FOREIGN KEY(course_id) REFERENCES course(course_id), "
					+ "FOREIGN KEY(batch_id) REFERENCES batch_table(batch_id)"
					+ ")";

			String attendanceTable = "CREATE TABLE IF NOT EXISTS attendance ("
					+ "attendance_id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "student_id INT, "
					+ "batch_id INT, "
					+ "attendance_date DATE, "
					+ "attendance_status VARCHAR(30), "
					+ "FOREIGN KEY(student_id) REFERENCES student(student_id), "
					+ "FOREIGN KEY(batch_id) REFERENCES batch_table(batch_id)"
					+ ")";

			String feesTable = "CREATE TABLE IF NOT EXISTS fees ("
					+ "fees_id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "student_id INT, "
					+ "total_fees DOUBLE, "
					+ "paid_fees DOUBLE, "
					+ "pending_fees DOUBLE, "
					+ "FOREIGN KEY(student_id) REFERENCES student(student_id)"
					+ ")";

			String paymentTable = "CREATE TABLE IF NOT EXISTS payment ("
					+ "payment_id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "fees_id INT, "
					+ "amount DOUBLE, "
					+ "payment_date DATE, "
					+ "payment_mode VARCHAR(30), "
					+ "transaction_reference VARCHAR(100), "
					+ "FOREIGN KEY(fees_id) REFERENCES fees(fees_id)"
					+ ")";

			String assignmentTable = "CREATE TABLE IF NOT EXISTS assignment ("
					+ "assignment_id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "course_id INT, "
					+ "trainer_id INT, "
					+ "assignment_title VARCHAR(100), "
					+ "submission_date DATE, "
					+ "assignment_status VARCHAR(30), "
					+ "FOREIGN KEY(course_id) REFERENCES course(course_id), "
					+ "FOREIGN KEY(trainer_id) REFERENCES trainer(trainer_id)"
					+ ")";

			String resultTable = "CREATE TABLE IF NOT EXISTS result_table ("
					+ "result_id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "student_id INT, "
					+ "exam_name VARCHAR(100), "
					+ "marks DOUBLE, "
					+ "grade VARCHAR(10), "
					+ "result_status VARCHAR(30), "
					+ "FOREIGN KEY(student_id) REFERENCES student(student_id)"
					+ ")";
			
			PreparedStatement ps1 = con.prepareStatement(studentTable);
			PreparedStatement ps2 = con.prepareStatement(courseTable);
			PreparedStatement ps3 = con.prepareStatement(trainerTable);
			PreparedStatement ps4 = con.prepareStatement(batchTable);
			PreparedStatement ps5 = con.prepareStatement(enrollmentTable);
			PreparedStatement ps6 = con.prepareStatement(attendanceTable);
			PreparedStatement ps7 = con.prepareStatement(feesTable);
			PreparedStatement ps8 = con.prepareStatement(paymentTable);
			PreparedStatement ps9 = con.prepareStatement(assignmentTable);
			PreparedStatement ps10 = con.prepareStatement(resultTable);
			
			ps1.execute();
			ps2.execute();
		    ps3.execute();
			ps4.execute();
			ps5.execute();
			ps6.execute();
			ps7.execute();
			ps8.execute();
			ps9.execute();
			ps10.execute();
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
