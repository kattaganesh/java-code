package p6p6;

import java.util.Scanner;

public class Assignment3 {
boolean validateUsername(String uname)
{
	if(uname.length()>=12)
	{
		if(uname.endsWith("_job"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	else
	{
		return false;
	//System.out.println("Length must be atleast 8 characters...");	
	}
}
	
	public static void main(String[] args) {
Scanner s=new 	Scanner(System.in);

System.out.println("enter the uname:");
String uname =s.nextLine();

boolean r=new Assignment3().validateUsername(uname);
System.out.println(r);

	}

}
