package p4;

public class Register implements Runnable{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("Register for "+Thread.currentThread().getName());
	try {
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	
}
}
