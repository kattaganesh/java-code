package p3;

public interface I1 {
void m1(int x);
static void m2(int z)
{
	System.out.println("static m2(z) I1");
	System.out.println("z:"+z);
}
default void m3(int z,int p)
{
System.out.println("default m3(z,p) I1");
System.out.println("z:"+z);
this.m4(p);
}
private  void m4(int p)
{
	System.out.println("Instance m4(p) I1");
	System.out.println("p:"+p);
}
}
