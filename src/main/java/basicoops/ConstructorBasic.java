package basicoops;

public class ConstructorBasic {
	String name;
	
	ConstructorBasic(){
		this.name="I am trying";
	}
	
	//Parameterized  constructor
	ConstructorBasic(String name){
		this.name=name;
	}
	public void studentName() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		ConstructorBasic con=new  ConstructorBasic();
		System.out.println("Direct variable value : " +con.name);
		/*
		 * constructor will identifies its values when based on the methods invokes
		 * invoking using default constructor
		 */
		con.studentName();
		
		/*
		 * Parameterized constructor invokes based on the parameter
		 */
		ConstructorBasic parameterConst=new  ConstructorBasic("this is parameter");
		parameterConst.studentName();
		
	}

}
