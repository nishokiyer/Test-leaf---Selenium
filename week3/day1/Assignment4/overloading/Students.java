package week3.day1.Assignment4.overloading;

public class Students {
	
	public void getStudentInfo() {
		System.out.println("Student details will be retrived");
	}
	
	public int getStudentInfo(int a) {
		return a;
	}
	
	public int getStudentInfo(int a, int b) {
		int c = a + b;
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students ss = new Students();
		ss.getStudentInfo();
		System.out.println(ss.getStudentInfo(7));
		System.out.println(ss.getStudentInfo(3, 4));
	}

}
