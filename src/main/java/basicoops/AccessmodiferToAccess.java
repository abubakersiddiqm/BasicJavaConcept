package basicoops;

public class AccessmodiferToAccess extends Accessmodifer {

	public static void main(String[] args) {
		AccessmodiferToAccess a= new AccessmodiferToAccess();
		
		System.out.println("public " + a.a + "  protected " + a.c + " private is not access to other class ");
		
	}
}