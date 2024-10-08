package p5;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();int result=1;
	for(int i=1;i<=2;i++)
	{
		result=result*n;
	}
	System.out.println(result);
	}
}
