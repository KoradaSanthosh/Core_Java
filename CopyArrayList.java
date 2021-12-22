package Collections;


import java.util.ArrayList;
import java.util.List;

public class CopyArrayList {

	public static void main(String[] args) {
		ArrayList<String> santhosh=new ArrayList<String>();
		//Add the elements to the array
		santhosh.add("Metal");
		santhosh.add("Is");
		santhosh.add("Very Hard");
		System.out.println("This is first arraylist : " + santhosh);
		//To perform array list copy we need another array list
		//I am calling list from collections
		List<String> Ask = new ArrayList<String>();
		//adding elements in the list
		Ask.add("Sharwa");
		Ask.add("Unable to");
		Ask.add("lift the rod");
		
		//Adding all the elements of list to arrayList  <==== Array list Copy!! <--ArrayExtendin
		//Java do have inbuilt add()  ==> addAll()
		santhosh.addAll(Ask);
		System.out.println("Updated arrayLest Elements are: " + santhosh);
		
	}
}