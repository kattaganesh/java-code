package p3;

import java.util.Arrays;
import java.util.Scanner;

public class Spliterators {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the size:");
int n=s.nextInt();
Integer[] a=new Integer[n];
for(int i=0;i<a.length-1;i++)
{
	System.out.println("enter the element "+(i+1));
	a[i]=new Integer(s.nextInt());
}
Spliterator<Integer> ob=Arrays.spliterator(a);

	}

}
