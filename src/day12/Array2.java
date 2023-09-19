package day12;

public class Array2 {

	public static void main(String[] args) {
		int a[] = {10,20,70,5};
		int b[] = {25,15,20,45};
		
		int sum =a[0];
		int i =0;
		
//		while(i<a.length) {
//		
//			System.out.println(a[i]);
//			i++;
//	}
//		for (i=1; i<a.length; i++) {
//			sum = sum + a[i];
//	
//	} System.out.println(sum);
//		}}

	int largest = a[0];
	for (i=0; i<a.length; i++) {
		if(largest<a[i]) {
			largest=a[i];
		}
	}System.out.println(largest);
	}}
	