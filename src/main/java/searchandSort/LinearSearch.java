package searchandSort;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,7,8,9};
		int search=2;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==search) {
				System.out.println("search key array postion is " +i+ " and values is " +a[i]);
				break;
			}
		}
	}
}
