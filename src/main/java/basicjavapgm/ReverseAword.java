package basicjavapgm;

public class ReverseAword {

	public static void main(String[] args) {
		
		String s="Siddiq abubaker mohamed";
		String[] splits = s.split("\\s");
		String temp="";
		
		for (int i = 0; i < splits.length; i++) {
			String words=splits[i];
			String rev="";
			for (int j =words.length()-1; j >=0; j--) {
				rev=rev+words.charAt(j);
			}
			temp=temp+rev+" ";
		}
		System.out.println(temp);
		

	}

}
