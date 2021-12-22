package Collections;
import java.util.ArrayList;

public class SearchAndGetMethodsOfArray {

	public static void main(String[] args) {
		//FirstIndex //SecondIndex// ...... //LastIndex
		//Creating an arrayList
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		arr_int.add(1); //0
		arr_int.add(11);//1
		arr_int.add(21);//2
		arr_int.add(31);//3
		arr_int.add(91);//4
		arr_int.add(101);//5
		arr_int.add(83);//6
		arr_int.add(62);//7
		arr_int.add(82);// 8 
		arr_int.add(61);// 9 
		//FirstIndexOF an element <---- Inbuilt method i.e., IndexOf
		System.out.println("Index of the element 1: " + arr_int.lastIndexOf(1));
		System.out.println("Index of the element 11: " + arr_int.lastIndexOf(11));
		System.out.println("Index of the element 21: " + arr_int.lastIndexOf(21));
		System.out.println("Index of the element 31: " + arr_int.lastIndexOf(31));
		System.out.println("Index of the element 91: " + arr_int.lastIndexOf(91));
		System.out.println("*************************************************************");
		System.out.println("Index of the element 101: " + arr_int.lastIndexOf(101));
		System.out.println("Index of the element 83: " + arr_int.lastIndexOf(83));
		System.out.println("Index of the element 62: " + arr_int.lastIndexOf(62));
		System.out.println("Index of the element 82: " + arr_int.lastIndexOf(82));
		System.out.println("Index of the element 61: " + arr_int.lastIndexOf(61));
	}

}