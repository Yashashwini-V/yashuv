package Basics;

public class conditionalstatement {

	public static void main(String[] args) {
		
		int age;
		age=70;
		if (age>18) {
			if (age>60) {
				System.out.println("you're an senior citizen");
			}else {
			System.out.println("You're an adult");
			}
			
		}else if (age>12) {
			System.out.println("You're a teenager");

		}else {
			System.out.println("You're a child");

		} 


	}

}
