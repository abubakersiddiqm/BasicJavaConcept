package arrayPrgrams;

public class RotateArrayRight {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int n = 2;
		for (int i = 0; i < n; i++) {
			int j = 0, last;
			last = a[a.length - 1];
			for (j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[i] = last;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
