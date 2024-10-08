package p1;
import java.lang.*;
import java.util.*;

public class JaggedArray {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the array1 size:");
	int n1=s.nextInt();
 Integer a1[]=new Integer[n1];	
for(int i=0;i<n1;i++)
{
	a1[i]=new Integer(s.nextInt());
	
}
Arrays.sort(a1);
System.out.println("enter the array2 size:");
int n2=s.nextInt();
Integer a2[]=new Integer[n2];	
for(int i=0;i<n2;i++)
{
a2[i]=new Integer(s.nextInt());

}Arrays.sort(a2);
for(int i=a2.length-1;i>=0;i--)
{
	System.out.println(a2[i].toString());
}
Integer i[][]= {a1,a2};
for(Integer k[]:i)
{
	for(Integer m:k)
	{
		System.out.print(m.toString()+" ");
	}
	System.out.println();
}


}
}
