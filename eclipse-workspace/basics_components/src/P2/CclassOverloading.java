package P2;

public class CclassOverloading extends PclassOverloading {
	public static void  m1(int a,int b,int c)
	{
		System.out.println("==C static m1(a,b,c)");
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
	public static void m1(int a)
	{
		System.out.println("==C static m1(a)");
		System.out.println("a:"+a);
	}
	public void m(int x ,int y,int z)
	{
		super.m1(x,y);
		super.m1(x);
		this.m1(x,y,z);
		this.m1(x);
	}
	
}
