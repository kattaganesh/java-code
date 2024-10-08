package p6p6;

import java.util.Scanner;

public class Assignment2 {

	public void  diff(String n1)
	
	{
		for(int i=0;i<n1.length()-1;i++)
		{
			char ch1=n1.charAt(i);
			for(int j=i+1;j<=(i+1);j++)
			{
				char ch2=n1.charAt(j);
				int v1=Integer.parseInt(String.valueOf(ch1));
				int v2=Integer.parseInt(String.valueOf(ch2));
			int r;
			if(v1>v2)
			 { 
				  r=v1-v2;
				 }
			 else
			 { 
				  r=v2-v1;
				 }
				 
			System.out.print(r);
			}
		}
		System.out.print(n1.charAt(n1.length()-1));
	
	}
	
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the numer1:");
String n1=s.nextLine();


Assignment2 ob=new Assignment2();
ob.diff(n1);


	}

}
