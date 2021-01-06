package basicjavapgm;

public class CountCharacter{

	public static void main(String[] args) {
		String s="Rafan is sleeping on the bed";

		int count=s.length();
		/*
		 * for (int i = 0; i < splits.length; i++) { String word=splits[i];
		 * word.charAt(i).; }
		 */
		System.out.println("number of character is " +count);

		char[] ch = s.toCharArray();
		int value=0;
		for (char c : ch) {
			value++;

		}
		System.out.println("using for loop"+value);
		
		int withOutSpace=0;
		for (char c : ch) {
			if (c!=' ') {
				withOutSpace++;
			}
		}
		System.out.println(withOutSpace);
	}
}