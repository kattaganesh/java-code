package p3;

public class PDisplay1 {
private int k=300;
private static PDisplay1 ob=null;
private PDisplay1() {}
public static PDisplay1 getReference()
{
	if(ob==null)
	{
		ob=new PDisplay1();
	}
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
