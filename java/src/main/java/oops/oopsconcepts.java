package oops;

public class oopsconcepts {
	public static void main(String[] args) {
		HumanBeing obj1 = new HumanBeing("yashu", 23, "female");
		obj1.walk();
		obj1.eat();
		System.out.println(obj1.gender);
		obj1.gender ="Male";
		System.out.println(obj1.gender);
		
		HumanBeing obj2 = new HumanBeing("yadu", 19, "male");
		obj2.walk();
		obj2.eat();
		obj1.eat();
		System.out.println(obj2.gender);

	}	

}

class HumanBeing {
	String name;
	int age;
	String gender;
	
	public HumanBeing(String inputname, int inputage, String inputgender) {
		this.name = inputname;
		this.age = inputage;
		this.gender = inputgender;
		
	}
	public void walk() {
		System.out.println(this.name + " I'm walking");
		
	}
	
	public void eat() {
		System.out.println(this.name + " I'm eating");
	}
	
	
}

