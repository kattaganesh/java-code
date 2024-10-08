package p3;
import java.lang.*;
import java.util.*;
public class DemoException1 extends Exception{
public DemoException1(String msg)
{
	super(msg);
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
try(s;)
{
	System.out.println("enter the integer value1:");
	int v1=s.nextInt();
	System.out.println("enter the integer value2:");
	int v2=s.nextInt();
	if(v1<0 || v2<0)
	{
		DemoException1 de=new DemoException1("enter positive integers");
		throw de;
	}
	int r=v1+v2;
	float f=v1+v2;
	System.out.println(r+f);
}
catch(DemoException1 de)
{
	System.out.println(de.getMessage());
}
	}

}
