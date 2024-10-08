package p3;

public class Deposit implements Transactions{
	public void process(int amount)
	{
	  System.out.println("Amount Deposited:"+amount);
	  System.out.println("Before Deposit Amopunt:"+b.getBalance());
	  b.bal=b.bal+amount;
	  System.out.println("Total Balance:"+b.getBalance());
	  System.out.println("Deposit Transaction get Successsfully completed...");
	}
}
