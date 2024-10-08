package p6;

import java.util.Scanner;

public class Assignment4 {
int oddRounder(int a)
{
	if(a%2==0)
	{
		return a;
	}
	else
	{
		return (a/10+1)*10;
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values:");
		int n1=s.nextInt();
int r=new Assignment4().oddRounder(n1);
System.out.println(r)
;	}

}
