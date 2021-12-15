package Assignment;

public class AnimalObject
{
	//Declaring variables
	//Animal has a name,sound etc.,
	String name;
	String Sound;
	int NoOfLegs;
	//Creating Constructor and initializing the variables
	public AnimalObject(String name, String sound, int noOfLegs) {
		super();
		this.name = name;
		Sound = sound;
		NoOfLegs = noOfLegs;
	}
	//Creating method
	void AnimalDetails()
	{
		System.out.println("Animal Name: "+name);
		System.out.println("Animal Sound: "+Sound);
		System.out.println("Animal NoOfLegs: "+NoOfLegs);
	}
	public static void main(String[] args) 
	{
		//Creating object for class
		AnimalObject obj1=new AnimalObject("Dog","Bow...Bow...",4);
		AnimalObject obj2=new AnimalObject("Cat","meow...meow...",4);
		AnimalObject obj3=new AnimalObject("Rat","Kich...Kich...",4);	
	    //Invoking or calling methods
		System.out.println("=========================");
		obj1.AnimalDetails();
		System.out.println("=========================");
	    obj2.AnimalDetails();
	    System.out.println("=========================");
	    obj3.AnimalDetails();
	    System.out.println("=========================");
	}

}
