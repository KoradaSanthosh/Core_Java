package Day_9Assignment;

class Animalclass
{
	//Creating method for super class
	void noise()
	{
		System.out.println("All animals Make Noise");
	}	
}
class Snake extends Animalclass
{
	//Overriding super class method
	void noise()
	{
		System.out.println("Snake Noise is like bushh...bush....");
	}	
}
class Rat extends Animalclass
{
	//Overriding super class method
	void noise() 
	{
		System.out.println("Rat Noise is like Kich...Kich...");
	}
}

public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		//Creating objects for sub classes with super class oreference
		//This is called up casting
		/*If two classes having IS-A relation and we want a
		to access only super class methods we go for up casting
		But if the sub class methods are overrided and when we call that method
		then overrided method will get...
		 */
		Animalclass a=new Snake();
		a.noise();
		Animalclass d=new Rat();
		d.noise();
		
	}

}