package p3;

public class AnonymousExtensionClass {
public static void main(String args[])
{
	Pclasss ob=new Pclasss()
			{
			public void m1(int a)
	{
		System.out.println("Cclass m1(a)");
		System.out.println("a:"+a);
	}
	public void m2(int b)
	{
		System.out.println("Cclass m2(b)");
		System.out.println("b:"+b);
	}
	public void m3(int b)
	{
		System.out.println("Cclass m2(b)");
		System.out.println("b:"+b);
	}
	};
	ob.m1(111);
	ob.m2(2222);
	//ob.m3(333);
}
}
