package searchandSort;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[]= {2,4,5,6,8,9};
		int search=9;
		int first,last,mid;
		first=a[0];
		last=a.length-1;
		mid=(first+last)/2;
		
		while (first<=last) {
			if (a[mid]<search) {
				first=mid+1;
			}
			else if(a[mid]==search) {
				System.out.println(" element is found "+mid+ " and value is " +a[mid]);
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if (first>last) {
			System.out.println("Element is not found");
		}
	}
}
