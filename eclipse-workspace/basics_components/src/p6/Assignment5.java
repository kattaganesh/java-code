package p6;

import java.util.Scanner;

public class Assignment5 {
int findSign(int a)
{
	if(a>0) return 1;
	else if(a<0) return -1;
	else return 0;
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
while(true)
{
System.out.println("enter the values:");
int a=s.nextInt();
int r=new Assignment5().findSign(a);
System.out.println(r);
	}
	
	}

}
