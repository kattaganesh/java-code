package p4;

public class Login implements Runnable {
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("Login for "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
}
