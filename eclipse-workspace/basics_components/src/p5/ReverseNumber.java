package p5;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ente the number:");
		int n=s.nextInt();
		int r,sum=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		
		}n=temp;
		System.out.println(sum);
		if(n==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
		
	}

}
