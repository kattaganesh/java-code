package p1;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the array size:");
int n=Integer.parseInt(s.nextLine());
String[] a=new String[n];
	System.out.println("eneter the  "+n+" numbers");
for(int i=0;i<n;i++)
{
	System.out.println("enter the "+(i+1)+" value");
	a[i]=s.nextLine();
}
System.out.println("===display====");
for(int i=0;i<n;i++) {
System.out.println(a[i]);
	}
for(String r:a)
{
	System.out.println(r);
}
	}

}
