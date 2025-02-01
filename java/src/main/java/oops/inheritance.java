package oops;

public class inheritance {

	public static void main(String[] args) {
		System.out.println("----------Grand Father object---------");
		GrandFather ajja = new GrandFather();
		ajja.gfmethod();
		ajja.watch();
		
		System.out.println("----------Father object---------");
		Father appa = new Father();
		appa.fmethod();
		appa.gfmethod();
		appa.watch();
		
		System.out.println("----------Child object---------");
		Child naanu = new Child();
		naanu.cmethod();
		naanu.gfmethod();
		naanu.fmethod();
		naanu.watch();

		
	}
}
	
	class GrandFather{
		public GrandFather() {
			System.out.println("This is Grant Father Constructor");
		}
		
		public void gfmethod() {
			System.out.println("This is Grand Father Method");
		}
		
		public void watch() {
			System.out.println("This is Grand Father's Watch ");
		}
	}
	
	class Father extends GrandFather {
		public Father() {
			System.out.println("This is Father class Constructor");
		}
		public void fmethod() {
			System.out.println("This is Father Method");
		}
		public void watch() {
			System.out.println("This is Father's Watch ");
		}
}
	
	
	// multi-level inheritance

class Child extends Father{
	Child(){
		System.out.println("This is Child Class Constructor");

	}
	public void cmethod() {
		System.out.println("This is Child Method");
	}
}


