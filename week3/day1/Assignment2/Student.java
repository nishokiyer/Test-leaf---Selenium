package week3.day1.Assignment2;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student Name Method is called");
	}
	
	public void studentDept() {
		System.out.println("Student Department Method is called");
	}
	
	public void studentId() {
		System.out.println("Student Id Method is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ss = new Student();
		//Grand parent class methods
		ss.collegeName();
		ss.collegeCode();
		ss.collegeRank();
		//Parent Class Methods
		ss.deptName();
		//Student Class Methods
		ss.studentName();
		ss.studentDept();
		ss.studentId();
		
	}

}
