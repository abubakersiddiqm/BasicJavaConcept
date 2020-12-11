package arrayPrgrams;

import java.util.HashSet;
import java.util.Set;

public class FindtheDuplicateArraymoreThan3 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 2, 4, 8, 4, 5, 6, 8, 8, 8, 8 };
		// List<Integer>lst=new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
					set.add(a[i]);	
			}
		}
		System.out.println(set);
	}
}
