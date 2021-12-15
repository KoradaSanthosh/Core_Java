package Assignment;

public class WeighingMachine {

	//Declaring Variables
		String name;
		String colour;
		double capacity;
		//Creating Constructor
		public WeighingMachine(String name, String colour, double capacity) {
			super();
			this.name = name;
			this.colour = colour;
			this.capacity = capacity;
		}
		//Creating Method
		void WeighingMachine()
		{
			System.out.println("WeighingMachine Name: "+name);
			System.out.println("WeighingMachine colour: "+colour);
			System.out.println("WeighingMachine capacity: "+capacity);
		}
		public static void main(String[] args) 
		{
			//Creating Objects for class
			WeighingMachine obj1=new WeighingMachine("Hesley","Black",500);
			WeighingMachine obj2=new WeighingMachine("Vandley","Blue",300);
			WeighingMachine obj3=new WeighingMachine("Rylan","Brown",1000);
			//Invoking or calling methods
			System.out.println("*************************");
			obj1.WeighingMachine();
			System.out.println("*************************");
			obj2.WeighingMachine();
			System.out.println("*************************");
			obj3.WeighingMachine();
			System.out.println("*************************");
			
		}
		

	}