package Assignment;

public class CarObject 
{
	//Declaring variables
	//Car has a name,model,price
	String Carname;
	String FuelType;
	double price;
	//Creating Constructor and initializing
	public CarObject(String carname, String FuelType, double price) {
		super();
		Carname = carname;
		this.FuelType = FuelType;
		this.price = price;
	}
	//Creating Method
	void CarDetails()
	{
		System.out.println("Car name is: "+Carname);
		System.out.println("Car FuelType is: "+FuelType);
		System.out.println("Car price is: "+price);
	}
	public static void main(String[] args)
	{
		//Creating Objects for class
		CarObject obj1=new CarObject("Ford","Petrol/diesel",1700000);
		CarObject obj2=new CarObject("RollsRoyce","Petrol",1500000);
		CarObject obj3=new CarObject("Hyundai","unleaded",750000);
		//Invoking or calling methods
		System.out.println("**********************");
		obj1.CarDetails();
		System.out.println("**********************");
		obj2.CarDetails();
		System.out.println("**********************");
		obj3.CarDetails();
		System.out.println("**********************");
		
		
	}

}
