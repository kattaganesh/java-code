package p4;

public class Printer {

	public static synchronized void printer(int n,String uname)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("Print for the User "+uname+" "+i+" times...");
			try
			{
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
