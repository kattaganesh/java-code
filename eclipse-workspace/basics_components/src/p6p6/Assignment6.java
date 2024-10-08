package p6p6;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=s.nextLine().toLowerCase();
		String begin="";
		String end="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a')
			{
				begin=begin+ch;
			}
			else
			{
				end=end+ch;
			}
		}
		
		System.out.println(begin.concat(end));
	}

}
