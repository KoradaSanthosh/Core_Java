package Assignment;
public class MultipleStaticBlocks
{
	//Declaring variables
	static int num;
	static String my_str;
	//first static block
	static {
		System.out.println("static block-I");
		num=369;
		my_str="first static block";
	}
	//second static block
	static {
		System.out.println("static block-II");
		num=145;
		my_str="second static block";
	}
	//third static block
	static {
		System.out.println("static block-III");
		num=659;
		my_str="third static block";
	}

	public static void main(String[] args) 
	{
		System.out.println(num);
		System.out.println(my_str);
		
	}

}
