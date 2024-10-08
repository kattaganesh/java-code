package p3;
import java.util.*;
public class BankMain {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int count=0;
xyz:
while(true) {
System.out.println("enter the PinNO:");
int pin=Integer.parseInt(s.nextLine());
CheckPinNo cp=new CheckPinNo();
boolean t=cp.checkPin(pin);
y: while(true) {
if(t)
{
	System.out.println("Select The Transaction Type:");
	System.out.println("1.Withdraw\n2.Deposit\n3.exit\n4.Check the balance");
	System.out.println("select the choice:");
	switch(Integer.parseInt(s.nextLine()))
	{
	case 1:
		System.out.println("eneter the amount to be withdraw:");
		int a1=Integer.parseInt(s.nextLine());
		
		if(a1>0 && a1%100==0)
		{
			Transactions ob=(int amount)-> {
				
					if(amount<Transactions.b.bal)
					{
						System.out.println("Amount Withdrawn:"+amount);
						Transactions.b.bal=Transactions.b.bal-amount;
						System.out.println("Current Balance After withDraw:"+Transactions.b.getBalance());
						System.out.println("WithDraw Transaction get Comepleted Successfully.....");
					}
					else {
						System.err.println("Insufficeinet Funds ........");
					}
		//	WithDraw w=new WithDraw();
					
			
		};ob.process(a1);
		}
		else
		{
			System.err.println("enter the amount in multiples of 100");
			
		}
		break;
	case 2:
		System.out.println("eneter the amount to be deposit:");
		int a2=Integer.parseInt(s.nextLine());
		if(a2>0 && a2%100==0)
		{
			Transactions ob=(int amount)-> 
			{
			  System.out.println("Amount Deposited:"+amount);
			  System.out.println("Before Deposit Amopunt:"+Transactions.b.getBalance());
			  Transactions.b.bal=Transactions.b.bal+amount;
			  System.out.println("Total Balance:"+Transactions.b.getBalance());
			  System.out.println("Deposit Transaction get Successsfully completed...");
			};
			ob.process(a2);
		}
				
				
		else
		{
			System.err.println("enter the amount in multiples of 100");
			
		}
		break;
	case 3:
		System.err.println("Transaction get Stopped.....");
	break y;
	
	case 4:
		System.out.println("Current Balance:"+Transactions.b.getBalance());
		break;
	}
}
else
{
	System.err.println("enter the PinNo Correctly....");
	count++;
	break;
	
}}
if(count==3)
{
	System.err.println("Pin Entered Limit Exceeded 3 times Transaction get Blocked Please try After 1 Day.......");
	break xyz;
}

}}

}
