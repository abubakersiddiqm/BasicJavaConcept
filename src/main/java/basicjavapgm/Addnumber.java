package basicjavapgm;

public class Addnumber {

	public static void main(String[] args) {
		int r,sum=0,temp,n=123;
		temp=n;
		while (n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println(" add number of integer " +sum);
	}
}
