package P2;

public class OverrideC extends OverrideP {
	OverrideC(int a)
	{
		super(123);
		System.out.println("===Cclasss Constructor===");
		System.out.println("a:"+a);
	}
	public static void m1(int m)
	{
		System.out.println("==Cclass Static method");
		System.out.println("m:"+m);
	}
	public void m2(int n)
	{
		System.out.println("==Cclass Instance method..");
		System.out.println("n:"+n);
	}
}
