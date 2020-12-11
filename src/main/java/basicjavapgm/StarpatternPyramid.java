package basicjavapgm;

public class StarpatternPyramid {

	public static void main(String[] args) {
     
		int star=6;
		for (int i = 0; i < star; i++) {
			for (int j = star-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
