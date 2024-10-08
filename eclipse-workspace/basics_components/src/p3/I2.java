package p3;

public interface I2 {
	void m1(int x);
	static void m22(int z)
	{
		System.out.println("static m22(z) I2");
		System.out.println("z:"+z);
	}
	default void m33(int z,int p)
	{
	System.out.println("default m33(z,p) I2");
	System.out.println("z:"+z);
	this.m4(p);
	}
	private  void m4(int p)
	{
		System.out.println("Instance m44(p) I2");
		System.out.println("p:"+p);
	}
}
