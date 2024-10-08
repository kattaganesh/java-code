package p3;

public interface Itest {
void  m(int a);
default void mm(int z)
{
	System.out.println("Ietst Default mm(z)");
	System.out.println("z:"+z);
}
}
