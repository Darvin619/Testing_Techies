package day12Practice;

public class Child extends Parent{
	
	public void SUM(int a, int b) {
		
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.SUM(10, 20);

	}

}
