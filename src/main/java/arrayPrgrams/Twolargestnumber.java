package arrayPrgrams;

public class Twolargestnumber {

	public static void main(String[] args) {
		int arr[]= {10,20,50,80,12,76,22,100,90};
		int first=arr[0];
		int second = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>first) {
				second=first;
				first=arr[i];
			} 
			else if (arr[i]>second && arr[i]!=first) {
				second=arr[i];
			}
		}
		System.out.println(first+ " " + second);
	}
}
