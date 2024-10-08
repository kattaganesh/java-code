package p5;
import java.util.*;
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ente the number:");
		String str=s.nextLine();
		int len=str.length()
;		double n=Integer.parseInt(str);
		double c,r,sum=0,temp;
		System.out.println(len);
		temp=n;
		
		while(n>0)
		{
		//1534
			r=n%10;
			System.out.println(r);
			c=Math.pow(r,len);
		
			sum=sum+c;
			n=n/10;
			
		}
		temp=n;
		if(n==sum)
		{
			System.out.println("Amstrong");
		}
		else
		{
		System.out.println("not");
		}
		
		
	}


}
