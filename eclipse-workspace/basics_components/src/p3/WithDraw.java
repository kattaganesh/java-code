package p3;

public class WithDraw implements Transactions {
public void process(int amount)
{
	if(amount<b.bal)
	{
		System.out.println("Amount Withdrawn:"+amount);
		b.bal=b.bal-amount;
		System.out.println("Current Balance After withDraw:"+b.getBalance());
		System.out.println("WithDraw Transaction get Comepleted Successfully.....");
	}
	else {
		System.out.println("Insufficeinet Funds ........");
	}
}
}
