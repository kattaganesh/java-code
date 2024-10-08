package p5;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str1=s.nextLine().toLowerCase()
;	System.out.println("enter the string:");
String str2=s.nextLine().toLowerCase()
;
int len1=str1.length()
;
int len2=str2.length();
if(len1==len2)
{
	char ch1[]=str1.toCharArray();
	char ch2[]=str2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	System.out.println(ch1);
	System.out.println(ch2);
	boolean t=Arrays.equals(ch1, ch2);
	if(t)
	{
		System.out.println(" Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}
	
	
	}
else
{
	System.out.println("Not Anagram");
}}
	

}
