package oops;

public class Polymorphism {
	public static void main(String[] args) {
		Maths obj = new Maths();
		obj.sum(5, 6);
		obj.sum(5.7, 8.7);
		obj.sum(6.7, 8.9, 6.9);

	}

}

class Maths{
	public void sum(int a, int b) {
		int total=a+b;
		System.out.println(total);
	}
	
	public void sum(double a, double b) {
		double total=a+b;
		System.out.println(total);
	}
	
	public void sum(int a, int b, int c) {
		int total=a+b+c;
		System.out.println(total);
	}
	
	public void sum(double a, double b, double c) {
		double total=a+b+c;
		System.out.println(total);
	}
}

