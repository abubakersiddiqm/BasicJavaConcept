package basicjavapgm;

public class GiveNumberIsPrimeNumber {

	public static void main(String[] args) {
		int n=23;
		int i;
		
		for (i = 2; i < n; i++) {
			
			if(n%i==0) {
				break;
			}
		}
		 if(i==n) {
				System.out.println(" prime number");
			}	 
		 else {
				System.out.println(" not prime number");
		 }
	}
}
