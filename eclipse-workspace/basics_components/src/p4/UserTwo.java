package p4;

public class UserTwo implements Runnable{
public Printer p=null;
public UserTwo(Printer p)
{
	this.p=p;
}
public void run()
{
	
		p.printer(8, "Virat King");
	
}
}
