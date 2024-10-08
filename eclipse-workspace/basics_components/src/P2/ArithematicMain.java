package P2;

import java.util.Scanner;

public class ArithematicMain {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the a:");
int a =s.nextInt();
System.out.println("enter the value b:");
int b=s.nextInt();
while(true) {
if(a>0 && b>0)
{
	System.out.println("enter the operations:");
	System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.MODDIV");
	System.out.println("eneter the choice:");
	switch(s.nextInt()) {
	case 1:
		Iarith add=new Iarith() {
			public double cal(int a,int b)
			{
				return a+b;
			}
		};
	double r1=add.cal(a, b);
	System.out.println("ADDITION OF "+a+","+b +" is "+r1);		break;
	case 2:
		SubIC sub=new SubIC();
		double r2=sub.cal(a, b);
		System.out.println("SUB OF "+a+","+b +" is "+r2);
		break;
	case 3:
		MulIC mul=new MulIC();
		double r3=mul.cal(a, b);
		System.out.println("MUL OF "+a+","+b +" is "+r3);
		break;
	case 4:
		DivIC div=new DivIC();
		double r4=div.cal(a, b);
		System.out.println("DIV OF "+a+","+b +" is "+r4);
		break;
	case 5:
		ModIC mod=new ModIC();
		double r5=mod.cal(a, b);
		System.out.println("MODDIV OF "+a+","+b +" is "+r5);
		break;
	}
}
else
{
	System.out.println("enter the Positive values only.......");
}}
	}

}
