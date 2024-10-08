package p6;

import java.util.Scanner;

public class Assignment1 {
int isEven(int a)
{
	if(a%2==0)
		return 1;
	else
		return 0;
}
	
	
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the values:");
int n=s.nextInt();
int r=new Assignment1().isEven(n);
	System.out.println(r);
	}

}
