package arrayPrgrams;

import java.util.Arrays;

public class RemoveDuplicateElementinArray {

	public static int duplicate(int a[], int n) {
		int j = 0;
		if (n == 0 || n == 1) {
			return n;
		}
		for (int i = 0; i < n; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n - 1];
		return j;
	}
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 5, 6, 7, 6, 8, 8 };
		Arrays.sort(a);
		int leght = a.length - 1;
		int dup = duplicate(a, leght);

		for (int i = 0; i < dup; i++) {
			System.out.println(a[i]);
		}
	}
}
