package p5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ente the number:");
		int y=s.nextInt();
		String st=Integer.toString(y);
		String st2=String.valueOf(y);
		String st3=y+"";
		if((y%4==0 && y%400==0)||(y%100!=0))
		{
			System.out.println("Leap year...");
		}
		else
		{
			System.out.println("Not Leap");
		}
	}

}
