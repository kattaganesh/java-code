package p6p6;

import java.util.Scanner;

public class Assignment1 {
int round(int num)
{
	int remainder=num%10;
	if(remainder<5)
	{
		return (num/10)*10;
	}
	else
	{
		return ((num/10)+1)*10;
	}
}

int sumRoundedValues(int a,int b,int c)
{
	if((a<0 || b<0 || c<0)||(a==0 || b==0 ||c==0))
	{
		return -1;
	}
	else {
		return round(a)+round(b)+round(c);
	}
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the v1");
int v1=s.nextInt();
System.out.println("enter the v1");
int v2=s.nextInt();
System.out.println("enter the v1");
int v3=s.nextInt();
int n1=new Assignment1().round(v1);
int n2=new Assignment1().round(v2);
int n3=new Assignment1().round(v3);
System.out.println(n1+" "+n2+"\t"+n3);
int r=new Assignment1().sumRoundedValues(v1, v2, v3);
System.out.println(r);
	}

}
