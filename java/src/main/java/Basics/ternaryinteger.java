package Basics;

public class ternaryinteger {

	public static void main(String[] args) {
		int a, b, c;
		a=20;
		b=10;
		c=11;

		if (a<b) {
			if (b<c) {
				System.out.println(" b is lesser");
			}else {
			System.out.println(" c is greater");
			}
			
		}else if (a<c) {
			System.out.println(" a is lesser");

		}else {
			System.out.println(" c is greater");
		}
}
}