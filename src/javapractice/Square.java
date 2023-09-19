package javapractice;

public class Square extends Rectangular{
	
	public void print() {
		
		System.out.println("Square is a Rectangle");
	}

	public static void main(String[] args) {
		
		Rectangular obj = new Rectangular();
		
		obj.printshape();
		obj.printRectangle();

	}

}
