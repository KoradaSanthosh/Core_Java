package AssignmentJava;
import java.util.Scanner;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area;
		int length;
		int breadth;
		int side;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		length = scan.nextInt();
		System.out.println("Enter the breadth of rectangle : ");
		breadth = scan.nextInt();
		area = length * breadth; // area of rectangle
		System.out.println("Area of rectangle " + area);
		
		System.out.println("Enter the sides of cube : ");
		side = scan.nextInt();
		scan.close();
		
		area = 6*(side*side);//Area of cube
		System.out.println("area of cube is " + area);
	}

}
