package p6;

import java.util.Scanner;

public class Assignment2 {
int getGreatest(int a,int b)
{
	if(a<0 || b<0)
		return -1;
	else if(a==0 ||b==0)
		return -2;
	else 
		if(a>b)
		return a;
		else return b;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values:");
		int n1=s.nextInt();
		System.out.println("enter the values:");
		int n2=s.nextInt();
		int r=new Assignment2().getGreatest(n1,n2);
			System.out.println(r);
	}

}
