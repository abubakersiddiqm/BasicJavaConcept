package basicjavapgm;

public class RemoveTheSpecialCharacter {

	public static void main(String[] args) {

		//using Reg expersion for 
    String a="Abubaker @$iddiq";
    String b="@#<>$abu%&ABUFG";
    String temp = "";
    //using [^a-zA-Z0-9]
        a=a.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(a);       
        //for loop
       for (int i = 0; i < b.length(); i++) {
		if (b.charAt(i)>64 && b.charAt(i)<=122) {
			temp=temp+b.charAt(i);
		}
	}
       System.out.println(temp);
	}
}
