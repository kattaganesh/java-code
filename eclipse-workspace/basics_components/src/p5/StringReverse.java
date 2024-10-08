package p5;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string....");
		String str=s.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
	char ch=str.charAt(i);
	String sn=String.valueOf(ch);
	Integer n1=Integer.parseInt(sn);
	System.out.print(n1);
}
	
	}

}
