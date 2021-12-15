package Two_2D_Arrays;

class computer{
	String name;
	String language;
	String city;
	String state;
	computer(){
		System.out.println("This is a default constructor");
		name="Santhosh";
		language="Java_Core-OOps";
		city="Vizianagaram";
		state="AndhraPradesh";
	}
}

public class ConstructorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer object=new computer();
		System.out.println(object.name);
		System.out.println(object.language);
		System.out.println(object.city);
		System.out.println(object.state);
	}

}
