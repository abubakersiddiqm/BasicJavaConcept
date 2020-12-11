package basicoops;

class Animal{  
	void eat()
	{
		System.out.println("Animal eating...");
	}
	
	void eat(String overload) {
		System.out.println(" parent overload method to override: " +overload);
	}
} 

public class MethodOverriding extends Animal{
	void eat(){
		System.out.println("MethodOverriding eating bread...");
	}
	
	void eat(String overload) {
		System.out.println(" subclass overload method to override: " +overload);
	}
	public static void main(String[] args) {
		MethodOverriding m=new MethodOverriding();
		m.eat();
		m.eat("child");
		
		Animal an=new Animal();
		an.eat();
		m.eat("parent");
		
		Animal meth=new MethodOverriding();
		meth.eat();
		meth.eat("parent ref and child class");
		
	}
} 
