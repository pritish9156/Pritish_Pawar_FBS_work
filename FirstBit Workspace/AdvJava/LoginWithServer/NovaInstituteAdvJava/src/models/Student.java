package models;

public class Student {
	
	int studentId;
	String studName;
	String email;
	String city;
	int age;
	double feesPaid;
	
	public Student() {
		
	}
	
	public Student(int studentId, String studName, String email, String city, int age, double feesPaid) {
		super();
		this.studentId = studentId;
		this.studName = studName;
		this.email = email;
		this.city = city;
		this.age = age;
		this.feesPaid = feesPaid;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studName=" + studName + ", email=" + email + ", city=" + city
				+ ", age=" + age + ", feesPaid=" + feesPaid + "]";
	}
	
	 
}
