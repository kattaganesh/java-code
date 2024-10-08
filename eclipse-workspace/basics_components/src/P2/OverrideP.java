package P2;

public class OverrideP {
	OverrideP(int a)
	{
		System.out.println("===Pclasss Constructor===");
		System.out.println("a:"+a);
	}
	public static void m1(int m)
	{
		System.out.println("==Pclass Static method");
		System.out.println("m:"+m);
	}
	public void m2(int n)
	{
		System.out.println("==Pclass Instance method..");
		System.out.println("n:"+n);
	}
}
