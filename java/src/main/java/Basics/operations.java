package Basics;

public class operations {
	
	public static void main(String[] args) {
		/* Modulus operator % */
		int a = 673;
		int b = 5;
		int c = a % b;
		System.out.println(c); 
		
		System.out.println("---------increment/decrement--------");

		a--;
		System.out.println(a);
		
		--a;
		System.out.println(a);
		
		b++;
		System.out.println(b);
		
		++b;
		System.out.println(b);
		
		System.out.println("--------Reational Operators--------");
		
		System.out.println(a>b);
		System.out.println(a<b);
		
		
		System.out.println("------Logical Operators----------");
		System.out.println("-------and gate");
		
		
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println(false && false);
		System.out.println(false && true);
		
		System.out.println("------or gate");

		
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println(false || true);
		
		System.out.println("------not gate");

		System.out.println(true != false);
		System.out.println(false != true);

		
		System.out.println("-----ternary---");

		a=20;
		b=10;
		c=11;
		System.out.println((a>b)?a:b);
		
		
		System.out.println((a>b)?(a>c?a:c):(b>c?b:c));
		System.out.println((a>b)?(a>b?a:b):(b>c?b:c));
		System.out.println((a>b)?(a>b?a:b):(a>c?a:c));
		System.out.println((a<b)?(a<c?a:c):(b<c?b:c));
		System.out.println((a<b)?(b<c?b:c):(a<c?a:c));

		System.out.println("-----ternary---");
		int m, n, o, p;
		//m=n=o=p=67;
		m=64; n=8; o=3; p=2; 
		double z = m/n%o/p;
		
		System.out.println(z);
	
	}

}