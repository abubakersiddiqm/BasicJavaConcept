package arrayPrgrams;

public class SortAnArrayAscending {

	public static void main(String[] args) {
		int a[]= {4,5,6,2,1,3};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[i]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		
		
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}

//to find the second largest
		int secondlargest=a[a.length-2];
		System.out.println(secondlargest+" seclargest");
	}

}
