package p5;

import java.util.Scanner;

public class Penagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str1=s.nextLine().toLowerCase();
boolean allLtters=true;
		for(char ch='a';ch<='z';ch++)
	{
			System.out.println(str1.contains(String.valueOf(ch)));
		if(!str1.contains(String.valueOf(ch)))
		{
			allLtters=false;
			break;
		}
	}
		if(allLtters=true) {
System.out.println("panagram");}
		else
		{
			System.out.println("Not");
		}
	}

}
