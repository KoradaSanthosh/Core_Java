package Assignment;

public class BikeFeatures 
{
	//Declaring Variables
	String Model;
	String color;
	String BrakingSystem;
	double price;
	//Creating Constructor
	public BikeFeatures(String model, String color, String BrakingSystem, double price) {
		super();
		Model = model;
		this.color = color;
		this.BrakingSystem = BrakingSystem;
		this.price = price;
	}
	//Creating method
	void BikeDetails()
	{
		System.out.println("Bike Model is: "+Model);
		System.out.println("Bike color is: "+color);
		System.out.println("Bike Braking System is: "+BrakingSystem);
		System.out.println("Bike price is: "+price);
	}
	public static void main(String[] args)
	{
		//Creating object for class
		BikeFeatures obj1=new BikeFeatures("Hero Honda","Blue","Disc Brake",15000);
		BikeFeatures obj2=new BikeFeatures("Access","White","Drum Brake",20000);
		BikeFeatures obj3=new BikeFeatures("Bajaj","Black","Disc Brake",40000);
		//Invoking or calling methods
		System.out.println("**********************");
		obj1.BikeDetails();
		System.out.println("**********************");
		obj2.BikeDetails();
		System.out.println("**********************");
		obj3.BikeDetails();
		System.out.println("**********************");	
	}

}
