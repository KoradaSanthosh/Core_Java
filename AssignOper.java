package Basics;

import java.util.Scanner;

public class AssignOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num : ");
		num = scan.nextInt();
	//Test case 1:	
		num +=32;
		System.out.println("After using += Assignment operator " + num);
		
		num -=32;
		System.out.println("After using -= Assignment operator " + num);
		
		num *=32;
		System.out.println("After using *= Assignment operator " + num);
		
		num /=32;
		System.out.println("After using /= Assignment operator " + num);
		
		num %=32;
		System.out.println("After using *= Assignment operator " + num);
		//Test case 2:
		System.out.println("Enter the number : ");
		num = scan.nextInt();
		
		num += 21;
		System.out.println("After using += Assignment Operator " + num);
		
		num -= 98;
		System.out.println("After using -= Assignment Operator " + num);
		
		num *= 43;
		System.out.println("After using *= Assignment Operator " + num);
		
		num /= 9;
		System.out.println("After using /= Assignment Operator " + num);
		
		num %= 22;
		System.out.println("After using %= Assignment Operator " + num);
		scan.close();
		
	}

}
