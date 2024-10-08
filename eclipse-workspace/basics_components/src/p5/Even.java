package p5;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ente the number:");
		int n=s.nextInt();
		if((n&1)==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("oddd");
		}
	}

}
