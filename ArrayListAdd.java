package Collections;


import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {
		//Create a List
		ArrayList<Object> array_str = new ArrayList<Object>();
		System.out.println("*******************************************************");
		array_str.add("The Ramayana");
		array_str.add("Sri Rama");
		array_str.add("The Bhgavath geetha");
		array_str.add("The Krishna");
		array_str.add("Bible");
		array_str.add("Jesus");
		array_str.add("Quran");
		array_str.add("Muhammed");		
		System.out.println("Elements of Array_str of string type :" + array_str);
		System.out.println("*******************************************************");
		//Create another an array-list
		ArrayList<Integer> array_int = new ArrayList<Integer>();
		array_int.add(100);
		array_int.add(200);
		array_int.add(300);
		array_int.add(400);
		System.out.println("Elements of Array_int of string type : " + array_int);		
		array_str.addAll(array_int);
		System.out.println("Elements after adding the string type and string integer" + array_str);
	}
}
