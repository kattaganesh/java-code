package p3;

public class PDisplay {
	private int k=200;
private static PDisplay ob=null;
private PDisplay() {}
static 
{
	ob=new PDisplay();
}
public static PDisplay getReference()
{
	return ob;
}
private void m1()
{
	System.out.println("==private m1()===");
	System.out.println("k:"+k);
}
public void m2()
{
	System.out.println("==public instance m2()==");
	
	this.m1();
}
}
