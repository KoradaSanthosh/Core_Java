package Basics;

import java.util.Scanner;

public class DynamicDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num : ");
		num = scan.nextInt();
		
		System.out.println("Enter number : ");
		number = scan.nextInt();
		
		System.out.println("Before decrement " + num);
		System.out.println("Before decrement " + number);
		
		num--;
		number--;
		System.out.println("After decrement " + num);
		System.out.println("After decrement " + number);
		scan.close();

	}

}
