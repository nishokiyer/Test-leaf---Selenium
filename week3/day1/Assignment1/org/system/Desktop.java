package week3.day1.Assignment1.org.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("Desktop Size Method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop dd = new Desktop();
		dd.computerModel();
		dd.desktopSize();
	}

}
