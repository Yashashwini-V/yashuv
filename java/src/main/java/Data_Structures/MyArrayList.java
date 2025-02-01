package Data_Structures;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> integerAL = new ArrayList<Integer>();
		System.out.println(integerAL);
		integerAL.add(15);
		System.out.println(integerAL);
		integerAL.add(56);
		integerAL.add(1);
		integerAL.add(4);
		integerAL.add(null);
		System.out.println(integerAL);
		integerAL.add(2, 454);
		System.out.println("integerAL:"+integerAL);
		ArrayList<Integer> integerAL2= (ArrayList<Integer>) integerAL.clone();
		System.out.println("integerAL2:"+integerAL2);
		integerAL.addAll(integerAL2);
		System.out.println(integerAL);
		integerAL.addAll(2, integerAL2);
		System.out.println(integerAL);
//		integerAL2.clear();
		System.out.println("integerAL2:"+integerAL2);
		System.out.println(integerAL.contains(15));
		System.out.println(integerAL.containsAll(integerAL2));
		ArrayList<Integer> integerAL3= (ArrayList<Integer>) integerAL2.clone();
		integerAL3.add(45);
		System.out.println("integerAL3:"+integerAL3);
		integerAL3.add(45);
		System.out.println(integerAL3.equals(integerAL2));
		System.out.println(integerAL.get(4));
		System.out.println("==========For loop===========");
		for(int i=0; i<integerAL.size(); i++) {
			System.out.println(integerAL.get(i));
		}
		System.out.println("==========For-each loop===========");
		for(Integer element : integerAL) {
			System.out.println(element);
		}
		
		System.out.println("==========For-each method for an arraylist===========");
		integerAL.forEach(element -> System.out.println(element));
		
		System.out.println("==========iterator===========");
		 Iterator<Integer> iterator = integerAL.iterator();
		 
		 while(iterator.hasNext()) {
			 Integer element = iterator.next();
			 System.out.println(element);
		 }
		 
		 System.out.println("==========indexOf===========");
		 System.out.println(integerAL.indexOf(15));
		 
		 System.out.println("==========lastIndexOf===========");
		 System.out.println(integerAL.lastIndexOf(15));
		 
		System.out.println("Before removing the element at index 1"+integerAL);
		integerAL.remove(1);
		System.out.println("After removing the element at index 1"+integerAL);

		System.out.println("Before removing the element 454"+integerAL);
		integerAL.remove(16); //locking for index 
		System.out.println("After removing the element 454"+integerAL);
		
		System.out.println("Before removing the element 454"+integerAL);
		integerAL.remove((Integer)454);// wrapper class - convert primitive data types using type_casting.
		System.out.println("After removing the element 454"+integerAL);
		
		System.out.println("============================");
		System.out.println("integerAL:"+ integerAL);
		System.out.println("integerAL3:"+ integerAL3);
		integerAL.removeAll(integerAL3);
		System.out.println("integerAL after removing integerAL3:"+ integerAL);
		
/*		System.out.println("============================");
		integerAL.add(40);
		System.out.println("integerAL:"+ integerAL);
		System.out.println("integerAL3:"+ integerAL3);
		integerAL.removeAll(integerAL3);
		System.out.println("integerAL after removing integerAL3:"+ integerAL);
		*/
		
		System.out.println("============================");
		integerAL.add(40);
		System.out.println("integerAL:"+ integerAL);
		System.out.println("integerAL3:"+ integerAL3);
		ArrayList<Integer> integerAL4 = new ArrayList<Integer>();
		integerAL4.add(null);
		integerAL.remove(integerAL3);
		System.out.println("integerAL after removing integerAL3:"+ integerAL);
		
		
		System.out.println("============================");
		integerAL.removeIf(element -> (element%2==0));
		System.out.println(integerAL);

	}


}
