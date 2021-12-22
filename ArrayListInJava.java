package Collections;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		//I had created an array-list
		ArrayList<String> Objects = new ArrayList<String>();
		//Add an elements to the array-list
		//In built method and i.e add(); //This will takes only one parameter <Int, String>
		Objects.add("Capgemini");//<========0
		Objects.add("JEE Full Stack");//<==========1
		Objects.add("Programming");//<===2
		Objects.add("Training");//<=====3 Arraylist to technical
		Objects.add("Mumbai");//<=====4
		//Displaying the array elements.
		System.out.println("Array elements are: " + Objects);
		//We can change the elements of arrays at any moment of time.
		Objects.add(0, "Ethical");
		System.out.println("Element is been changed at possiton no.0");
		System.out.println(Objects);
		// In order to remove any element from the array
		Objects.remove(4);
		System.out.println("List elements after removing 'ArrayList' : " + Objects);
		System.out.println("Below element present at the 0,1,2,3,4th position in the array list");
		System.out.println(Objects.get(0));
		System.out.println(Objects.get(1));
		System.out.println(Objects.get(2));
		//Loop : for loop :  foreach
		System.out.println("This is from advanced loop");
		for(int i=0; i<Objects.size();i++)
			System.out.println(Objects.get(i));
		System.out.println("This is from ForEachLooop");
		for(String object : Objects)
			System.out.println(object);
	}
}