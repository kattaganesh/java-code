package p5;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
int a=0,b=1,c;
for(int i=1;i<=n;i++)
{
	c=a+b;
	System.out.print(c+" ");
	a=b;
	b=c;
}
		
		
		
	}

}
