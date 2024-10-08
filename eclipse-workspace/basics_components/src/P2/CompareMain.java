package P2;

import java.util.Scanner;

public class CompareMain extends Exception {
public CompareMain(String msg)
{
	super(msg);
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the v1:");
int v1=s.nextInt();
System.out.println("enter the v2:");
int v2=s.nextInt();
try {
	if(v1==v2)
	{
		CompareMain e=new CompareMain("equlsssss");
		throw e;
	}
	System.out.println("enter the operation:");
	System.out.println("1.Greater\n2.Least");
	System.out.println("enter the choice:");
	switch(s.nextInt())
	{
	case 1:
		GreaterIC g=new GreaterIC();
		int r=g.compare(v1, v2);
		System.out.println("Greater:"+r);
		break;
	case 2:
		LeastIC l=new LeastIC();
		int r1=l.compare(v1, v2);
		System.out.println("Least:"+r1);
		break;
		default:
			System.out.println("please enter the case properly..");
	}


	}
catch(CompareMain e)
{
	e.printStackTrace();
}
}

}
