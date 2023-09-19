package javapractice;

import day4PracticePackage.Day4_Div;

public class Day4 {
	
	int B = 10;
	
	void Sum(){
		
		int A = 5;
		
		int sum;
		sum = A+B;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		

		Day4 SUM = new Day4();
		
		SUM.Sum();
		
		Animal Obj = new Animal();
		System.out.println("declare 1st number as Local variable and 2nd no as Global variable done");
		
//		Obj.Division();
//		System.out.println("Calling method from different class in same package done");
		
		Day4_Div Obj2 = new Day4_Div();
		
		Obj2.Division();
		
		System.out.println("Calling method from different class from different package done");
	}

}
