package p3;

public class OterClass {
int a=100;
static int b=200;
public void m()
{
System.out.println("Outer class");
System.out.println("a:"+a);
System.out.println("b:"+b);
 class InnerClass
{
	public void m3()
	{
	System.out.println("Inner  class m3()");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	}
	public static  void m()
	{
	System.out.println("Inner class m()");
	//System.out.println("a:"+a);
	System.out.println("b:"+b);
	}
}
InnerClass i=new InnerClass();
i.m3();
InnerClass.m();
}
public static void m2()
{
System.out.println("Outer class");
//System.out.println("a:"+a);
System.out.println("b:"+b);
class InnerClass
{
	public void m3()
	{
	System.out.println("Inner  class m3()");
	//System.out.println("a:"+a);
	System.out.println("b:"+b);
	}
	public static  void m()
	{
	System.out.println("Inner class m()");
	//System.out.println("a:"+a);
	System.out.println("b:"+b);
	}
}
InnerClass i=new InnerClass();
i.m3();
InnerClass.m();
}

}
