package p5;

import java.util.Scanner;

public class StringPalindromeUsingPredefined {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string....");
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer(str);
	String revers=sb.reverse().toString();
	
		System.out.println(sb);
	if(revers.equals(str))
	{
System.out.println("palindrome");	
	}
	}

}
