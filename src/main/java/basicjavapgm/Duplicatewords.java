package basicjavapgm;

public class Duplicatewords {

	public static void main(String[] args) {
		String s="Rafan is sleeping Rafan wake late today";
		String[] splitWords = s.split(" ");
		for (int i = 0; i < splitWords.length; i++) {
			for (int j = i+1; j < splitWords.length; j++) {
				if (splitWords[i].equals(splitWords[j])) {
					System.out.println(splitWords[i]);
					
				}
			}
		}
	}
}
