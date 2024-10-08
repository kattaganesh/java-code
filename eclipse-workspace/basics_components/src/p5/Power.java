package p5;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
System.out.println("enter the number:");
int exp=s.nextInt();
int result=1;
for(int i=1;i<=exp;i++)
{
	result=result*n;
}
System.out.println(result);
}
}
