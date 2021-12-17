package Day_9Assignment;

class Electronics
{
	String Bike="KTM";
	String laptop="Asus";
	String Car="RollsRoyce";
	String Tv="Sony";	
}
public class SuperKeyword extends Electronics
{
	String Bike="Unicorn";
	String laptop="Hp";
	String car="BENZ";
	String Tv="Samsung";	
	void details()
	{
		//Super keyword is used to reference the super class members
		System.out.println("Bike is from super class: "+super.Bike);
		System.out.println("laptop is from sub class: "+laptop);
	}
	public static void main(String[] args) 
	{
		//Creating object for sub class
		SuperKeyword e=new SuperKeyword();
		//Invoking/calling sub class method
		e.details();
	}

}