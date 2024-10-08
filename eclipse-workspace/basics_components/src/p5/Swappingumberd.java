package p5;

import java.util.Scanner;

public class Swappingumberd {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the n1:");
int n1=s.nextInt();
System.out.println("enter the n2:");
int n2=s.nextInt();



n1=n1*n2;
n2=n1/n2;
n1=n1/n2;
System.out.println(n1);
System.out.println(n2);

	}

}
