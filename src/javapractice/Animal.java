package javapractice;

public class Animal {
	
 void sleep() {
	System.out.println("I am Sleeping");
}

 void Division(){
	 int Div;
	 int x=30;
	 int y=15;
	 Div = x/y;
	 
	 System.out.println(Div);
 }
 
 
 public void Run() {
	
	 String S;
	 
	 S = "While i Awake";
	 
	System.out.println("I am Running" + S);
	
}

	public static void main(String[] args) {
		
		Animal Tiger = new Animal();
		
//		Tiger.sleep();
//		System.out.println("Calling sleep Method is Completed");
		
		Tiger.Run();
//		System.out.println("Calling sleep Method is Completed as " + S);
	
		
	}


}
