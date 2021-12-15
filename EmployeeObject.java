package Assignment;

public class EmployeeObject 
{
	//Declaring the variables
	//Employee is a Object
	//Employee has a employee name,city,and work location
	String Ename;
	String Gender;
	String Organisation;
	//Constructor
	public EmployeeObject(String ename, String Gender, String Organisation) {
		super();
		Ename = ename;
		this.Gender = Gender;
		this.Organisation = Organisation;
	}
	//Creating method
	void EmployeeDetails()
	{
		//Printing Employee Details
		System.out.println("Employee name is: "+Ename);
		System.out.println("Employee Gender is: "+Gender);
		System.out.println("Employee Working Organisation is: "+Organisation);
	}
	public static void main(String[] args) 
	{
		//Creating objects for the class
		EmployeeObject obj1=new EmployeeObject("Srinu","Male","Capgemini");
		EmployeeObject obj2=new EmployeeObject("Devi","Female","Wipro");
		EmployeeObject obj3=new EmployeeObject("Jana","Male","Infosys");
		System.out.println("********************************");
		//Method calling with object reference
		obj1.EmployeeDetails();
		System.out.println("********************************");
		obj2.EmployeeDetails();
		System.out.println("********************************");
		obj3.EmployeeDetails();
		System.out.println("********************************");
		
	}

}
