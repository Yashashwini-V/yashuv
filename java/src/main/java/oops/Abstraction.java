package oops;

public class Abstraction {

	public static void main(String[] args) {
//		HumanBeings obj1 = new HumanBeings(); // Compile error: Cannot instantiate the type HumanBeings
		Male obj2 = new Male();
		obj2.eat();
		obj2.reproductive_system();

	}

}

abstract class HumanBeings{
	public void eat() { // Implemented method
		System.out.println("I'm eating");
	}
	
	public abstract void reproductive_system(); // abstract method; abstract keyword is mandatory
}
  
class Male extends HumanBeings{

	public void reproductive_system() {
		System.out.println("Reproductive system is implemented");
	}

}
