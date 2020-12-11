package arrayPrgrams;

public class CopyTheArrayElemt {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,10};
		int b[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		
		System.out.println("Element is original");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Copy of element");
		
		for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);	
		}

	}

}
