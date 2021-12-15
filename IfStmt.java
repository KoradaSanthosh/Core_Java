package Basics;
import java.util.Scanner;

public class IfStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		sc.close();
		if(number%2==0){
			System.out.println("It is a even number");
		}
		else{
			System.out.println("The number is odd");
		}
	}

}
