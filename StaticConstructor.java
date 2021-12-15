package Assignment;

		class mainclass 
		{
			//Create the Constructor
			public mainclass()
			{
				System.out.println("Static constructor");
			}
			//Create the Method
			void display1()
			{
				System.out.println("Main class method");
			}
			
		}
		//Obtaining properties from super class to sub class
		public class StaticConstructor extends mainclass 
		{
			//Create constructor in sub class
			public StaticConstructor()
			{
				System.out.println("This is minor Constructor");
			}
			//Creating child class method
			void display()
			{
				System.out.println("This is minor method");
			}
			//The Main Method
			public static void main(String[] args) 
			{
				//Creating object for child class
				StaticConstructor obj=new StaticConstructor();
				//Calling Methods
				obj.display();
				obj.display1();
				
			}
			

		}

