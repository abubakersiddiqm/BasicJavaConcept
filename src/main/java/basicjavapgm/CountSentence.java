package basicjavapgm;

public class CountSentence {

	public static void main(String[] args) {
String s="Rafan is sleeping on the bed";

int count=0;

for (int i = 0; i < s.length(); i++) {
	if (s.charAt(i)==' ') {
		count++;
	}
}
count=count+1;
System.out.println("number of sentence is " +count);
	}
}
