package Basics;
import java.util.Scanner;

public class MultiplyDynm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_one, number_two,result;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value : ");
		number_one = scan.nextInt();
		
		System.out.println("Enter second value : ");
		number_two = scan.nextInt();
		scan.close();
		
		result = number_one * number_two;
		System.out.println(result);
	}

}
