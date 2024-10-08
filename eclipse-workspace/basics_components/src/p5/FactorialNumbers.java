package p5;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
int sum=0;
int fact=1;
for(int i=n;i>=1;i--)
{
	fact=fact*i;
	
	
}
System.out.println(fact);
	}

}
