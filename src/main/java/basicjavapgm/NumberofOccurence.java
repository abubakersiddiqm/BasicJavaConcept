package basicjavapgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberofOccurence {
	public static void main(String[] args) {
		
		String s="rafan";
		
		char[] charArray = s.toCharArray();
		
		Map<Character, Integer>occurence=new HashMap<Character, Integer>();
		for (char c : charArray) {
			
			if (occurence.containsKey(c)) {
				
				int valueChar=occurence.get(c);
				occurence.put(c, valueChar+1);				
			}
			else {
				occurence.put(c, 1);
			}
			
		}
		
		//First occurence of the word
		Character key = null;
		for (Entry<Character, Integer> ent : occurence.entrySet()) {
			if (ent.getValue()==1) {
				 key = ent.getKey();
				 break;
			}
		}
		System.out.println("number of character repeated in the word is : " +occurence);
		System.out.println(" First occurence of word " +key);
	}
}
