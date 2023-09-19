package day11Practice;

public class Helecopter extends FlyingMachine{
	
	public void hover() {
		System.out.println("Helecopter can hover over ground");
	}

	public static void main(String[] args) {
		
		Helecopter Hel = new Helecopter();
		
		Hel.hover();
		Hel.travel();

}
}