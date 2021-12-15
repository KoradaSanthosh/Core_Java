package Basics;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		num=sc.nextInt();
		sc.close();
		if(num%4==0)
			System.out.println("It is a leap year");
		else
			System.out.println("It is a non leap year");
		

	}

}
