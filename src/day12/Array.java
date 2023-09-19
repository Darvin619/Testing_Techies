package day12;

public class Array {
	
	public static void main(String[] args) {
//		
//		int a[] = new int [3];
//		
//		a[0] = 15;
//		a[1] = 20;
//		a[2] = 25;
//		
//		System.out.println(a[1] + a[2]);
//		
		int a[] = {10,20,30,71,70,60};
		int b[] = {20,35,40,55,65,75};
//		int c[] = new int[3];
		int c[]= new int [b.length];
		
		int i=0;
		
		int Sum=0;
//		for (i=0;i<a.length;i++) {
//			Sum = Sum + a[i];
////			System.out.println(a[i]);
//		}System.out.println(Sum);
		
//		while(i<a.length) {
//			
//			Sum = Sum+a[i];
//			i++;}
//			
//			System.out.println(Sum);
			
//	}}
//		if(a.length != b.length) {
//			System.out.println("Array must be same length for summation");
//		}
//		for(i=0;i<c.length; i++) {
//		while(i<c.length) {
//			c[i] = a[i] + b[i];
		
//			System.out.print(c[i] + " ");
			
		
		int largest = a[0];
		
	for (i=0; i<a.length; i++) {
		if( largest <a[i]) {
			largest = a[i];
		}
		
	}	
	System.out.println(largest);	

		}}

