package p5;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
int result=1;
for(int i=1;i<n/2;i++)
{
	if(n%i==0)
	{
		result=i*i;
		if(n==result)
		{
			System.out.println(i);
			break;
		}
	}
}

	}
}
