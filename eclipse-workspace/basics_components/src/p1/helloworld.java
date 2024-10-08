package p1;
import java.util.*;
public class helloworld
{
	int a=10;
	static int b=29;
	helloworld()
	{
		System.out.println("===constructor===");
		System.out.println("a:"+a);
		System.out.println("B"+b);
		
	}
	helloworld(int a)
	{
		System.out.println("===constructor===");
		System.out.println("a:"+a);
		System.out.println("B"+b);
		
	}
	void display()
	{
		System.out.println("===instance method===");
		System.out.println("a:"+a);
		System.out.println("B"+b);
		
	}
	
	public static void main(String arg[])
	{
helloworld h=new helloworld();
helloworld h1=new helloworld();
helloworld h2=new helloworld();
h1.display();
h2.display();
h1.display();
h.display();

	}
}