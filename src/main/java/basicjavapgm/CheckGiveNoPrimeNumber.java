package basicjavapgm;

public class CheckGiveNoPrimeNumber {
public static void main(String[] args) {
	int n=5,i;
	for ( i = 2; i <= n; i++) {
		if (n%i==0) {
			break;
		}
	}
	if (n==i) {
		System.out.println("PrimeNumber");
	}
	else {
		System.out.println("NotPrimeNumber");
	}
}
}
