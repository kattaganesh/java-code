package p4;

public class UserOne implements Runnable{
public Printer p=null;
public UserOne(Printer p)
{
	this.p=p;
}
public void run()
{
	
		p.printer(10, "David Varma");
	
}
}
