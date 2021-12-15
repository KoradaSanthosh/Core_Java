package AssignmentJava;
import java.util.Scanner;
public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		int month=sc.nextInt();
		sc.close();
		switch (month) {
			case 1:
				System.out.println("Number of days is in the jan is 31  ");
				break;
			case 2:
				System.out.println("Number of days is in the Feb is 28  ");
				break;
			case 3:
				System.out.println("Number of days is in the march is 31  ");
				break;
			case 4:
				System.out.println("Number of days is in the April is 30  ");
				break;
			case 5:
				System.out.println("Number of days is in the May is 31  ");
				break;
			case 6:
				System.out.println("Number of days is in the Jun is 30  ");
				break;
			case 7:
				System.out.println("Number of days is in the July is 31  ");
				break;
			case 8:
				System.out.println("Number of days is in the Augast is 31 ");
				break;
			case 9:
				System.out.println("Number of days is in the Sept is 30  ");
				break;
			case 10:
				System.out.println("Number of days is in the October is 31  ");
				break;
			case 11:
				System.out.println("Number of days is in the Nov is 30 ");
				break;
			case 12:
				System.out.println("Number of days is in the Dec is 31  ");
				break;
			default:
				System.out.println("Invalid Input");
				}
				
				

		}




}


