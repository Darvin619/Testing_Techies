package javapractice;

public class Day3 {

	
	public void multiplication(int a, int b) {
		
		int mult;
		
		mult = a*b;
		
		System.out.println("Multiplictaion of a and b is " + mult);
		
	}
	
public void division(int a, int b) {
		
		int Divd;
		
		Divd = a/b;
		
		System.out.println("Multiplictaion of a and b is " + Divd);
		
}
	
	
	public static void main(String[] args) {
		

//		Day3 obj = new Day3();
//		
//		obj.multiplication(10, 5);
//		
//		System.out.println("Calling Mult object completed");
//		
//		obj.division(30, 15);
//		
//		System.out.println("Calling Division object completed");
		
		
		Animal obj2 = new Animal();
		
		obj2.Run();
		obj2.sleep();
	}

}
