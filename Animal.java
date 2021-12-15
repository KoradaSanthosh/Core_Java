package Assignment;
abstract public class Animal 
{
	//For abstract methods one of the method is abstract then class should be a abstract
	//Creating abstract method with abstract keyword
	//For abstract method there is no implementation
	public abstract void Animal_sound();
	//Creating implemented method
	public void sound()
	{
		System.out.println("This is implemented method in abstract class");
	}	
}
class Dog extends Animal
{
	//Providing implementation for the super class method
	public void Animal_sound()
	{
		System.out.println("It Barks like BOW... BOW...");
	}
	public static void main(String[] args) 
	{
		//Creating object for sub class
		Dog d=new Dog();
		//Calling or Invoking method
		d.Animal_sound();
		d.sound();
	}

}