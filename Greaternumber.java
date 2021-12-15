package Basics;
import java.util.Scanner;

public class Greaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_1,num_2,num_3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num_1: ");
		num_1=sc.nextInt();
		System.out.println("Enter the num_2: ");
		num_2=sc.nextInt();
		System.out.println("Enter the num_3: ");
		num_3=sc.nextInt();
		sc.close();
		if(num_1>num_2 && num_1>num_3)
			System.out.println("num_1 is greater");
		else if(num_2>num_1 && num_2>num_3)
			System.out.println("num_2 is greater");
		else if(num_3>num_1 && num_3>num_2)
			System.out.println("num_3 is greater");
		else
			System.out.println("Given numbers are equal");
			
			
			
		
		}
				
}