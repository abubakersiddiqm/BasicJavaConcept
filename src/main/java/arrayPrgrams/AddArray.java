package arrayPrgrams;

public class AddArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 10 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			temp = temp + a[i];
		}
		System.out.println(" sum of array is :" + temp);
	}

}
