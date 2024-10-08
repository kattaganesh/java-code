package p5;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string....");
		String str=s.nextLine();
		int j=str.length()-1;int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
			Integer n1=Integer.parseInt(String.valueOf(ch1));
			Integer n2=Integer.parseInt(String.valueOf(ch2));
			
			if(n1==n2)
			{
				count++;
			}
			j--;
			
		}
		if(count==str.length()
				)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
