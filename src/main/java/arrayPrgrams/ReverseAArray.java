package arrayPrgrams;

public class ReverseAArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 6, 7, 8 };
		int temp = 0;
		for (int i = a.length - 1; i > 0; i--) {
			temp = a[i];
			System.out.println(temp);
		}
	}
}
