package Assignment;

import java.util.Scanner;

public class MajorAccount 
{
	public static void main(String[] args) 
	{
		int num=1;
		Savings account=new Savings();
		Scanner input=new Scanner(System.in);
		while(num==1) {
		System.out.println("Choose an Option 1.Deposit 2.Withdraw 3.BalanceEnquiry");
		int option=input.nextInt();
		if(option==1)
		{
			System.out.println("You have selected the Deposite Option");
			System.out.println("Enter an amount to deposit");
			double amount=input.nextDouble();
			account.Deposit(amount);
			account.BalanceEnquiry();
		}
		else if(option==2)
		{
			System.out.println("You have selected the Withdraw option");
			System.out.println("Enter a amount to Withdraw");
			double amount=input.nextDouble();
			account.Withdraw(amount);
			account.BalanceEnquiry();
		}
		else
		{
			System.out.println("You have choosen balance enquiry option");
			System.out.println("Your account balance is: "+Account.balance);
		}
		System.out.println("Do you want to perform one more operation [Y/N");
		char option1=input.next().charAt(0);
        if(option1=='n' || option1=='N')
        {
        	num=2;
        }
		}
		System.out.println("Thank you and Visit again1");	    
		}	
	}
abstract class Account 
{
	static double balance=0;
	static double amount;
	public abstract void Deposit(double amount);
	public abstract void Withdraw(double amount);
	public abstract void BalanceEnquiry();
}
class Savings extends Account
{
	//implementing abstract methods
	public void Deposite(double amount)
	{
		balance=balance+amount;
	}
	public void Withdraw(double amount)
	{
		if(amount<balance)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("Insufficient funds");
		}
			
	}
	public void BalanceEnquiry()
	{
		System.out.println("Your account balance is: "+balance);
	}
}
