package p1;
import java.util.*;

public class ReverseString {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("eneter the String :");
	String str=s.nextLine();
	int j=str.length()-1;
int 	count=0;
	for(int i=0;i<=str.length()-1;i++)
	{
		char ch1=str.charAt(i);
		char ch2=str.charAt(j);
		if(ch1==ch2)
		{
			count++;
		}
		j--;
	}
	if(count==str.length())
	{
		System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
	
	
}
}
