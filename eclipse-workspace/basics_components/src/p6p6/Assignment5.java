package p6p6;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=s.nextLine().toLowerCase();
		char[] ch1=str.toCharArray();
		char[] ch2=str.toCharArray();
	Arrays.sort(ch1);	
	if(Arrays.equals(ch1, ch2))
	{
		System.out.println("positive");
	}
	else
	{
		System.out.print("negative");
	}
	}

}
