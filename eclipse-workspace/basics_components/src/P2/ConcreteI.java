package P2;

public interface ConcreteI {
public abstract void m1(int x);

static void m2(int a)
{
	System.out.println("I m2(a)");
	System.out.println("a:"+a);
}
default void m3(int m)
{
	System.out.println("I m3(m)");
	System.out.println("m:"+m);
	this.m5();
	ConcreteI.m4();
}
private static void m4()
{
	System.out.println("I m4()");
}
private void m5()
{
	System.out.println("I m5()");
}
}
