package p6p6;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string:");
String str=s.nextLine();
while(true)
{
	System.out.println("1.add\n2.replace()\n3.removeduplicate\n4.chageuppercase\n");
	System.out.println("enter the choice:");
	switch(Integer.parseInt(s.nextLine()))
	{
	case 1:
		if(str.length()>0)
		{
			String str2=str.concat(str);
			System.out.println(str2);
		}
		else
		{
			System.out.println("empty...");
		}
		break;
	case 2:if(str.length()>0)
	{
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
             System.out.print("*");
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}System.out.println();
	}
	else
	{
		System.out.println("empty...");
	}
		break;
	case 3:if(str.length()>0)
	{String st="";
		for(int i=0;i<str.length();i++)
{
			char ch=str.charAt(i);
			
			if(!st.contains(String.valueOf(ch))) {
				 st=st+ch;
			}
			
			
			}System.out.print(st);
	
	}
	else
	{
		System.out.println("empty...");
	}
		break;
	case 4:if(str.length()>0)
	{
		
	}
	else
	{
		System.out.println("empty...");
	}
		break;
	
	}
}
	}

}
