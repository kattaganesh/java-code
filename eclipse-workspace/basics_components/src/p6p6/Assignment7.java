package p6p6;

import java.util.Scanner;

public class Assignment7 {
boolean validate(String uname)
{
	int count=0;
	for(int i=0;i<uname.length();i++)
	{
		
		char ch=uname.charAt(i);
		
		if(ch=='@')
		{
			count++;
			System.out.println(count);
		}
	}
	if(count>1)
	{
		return false;
	}
	else {
		return true;
	}
	
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String email=s.nextLine().toLowerCase();
		boolean t=new Assignment7().validate(email);
	System.out.println(t);
	}

}
