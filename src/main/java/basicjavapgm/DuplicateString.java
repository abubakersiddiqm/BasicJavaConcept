package basicjavapgm;

public class DuplicateString {

	public static void main(String[] args) {
		String s = "siddiq Rafan";
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j] && chars[i] != ' ') {
					System.out.println(chars[i]);
				}
			}
		}
	}
}
