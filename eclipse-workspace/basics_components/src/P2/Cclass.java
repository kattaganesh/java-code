package P2;

public class Cclass extends Pclass1 {
	void cim()
	{
		System.out.println("C INSTANCE METHOD");
	}
	Cclass()
	{
		System.out.println("cclass constructor..");
	}
static
{
	System.out.println("C STATIC BLOCK..");
}
{
	System.out.println("C INSTANCE BLOCK");
}
static void  csm()
{
	System.out.println("C STATIC METHOD");
}

}
