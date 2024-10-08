package p5;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ente the number:");
		int n=s.nextInt();
	int temp=n;
	int r,sum=0,count=0;
	while(n>0)
	{
		r=n%10;
		int fact=1;
		for(int i=r;i>=1;i--)
		{
			fact=fact*i;
			System.out.println(fact);
		}sum=sum+fact;
		System.out.println(sum);
		n=n/10;
		
	}n=temp;
	if(n==sum)
	{
		System.out.println("Strong");
	}
	else
	{
		System.out.println("Not");
	}
	}

}
