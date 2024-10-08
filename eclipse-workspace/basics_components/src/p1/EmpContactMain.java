package p1;
import p1.*;
import java.util.*;

public class EmpContactMain {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enetr the no.of employees:");
int n=Integer.parseInt(s.nextLine());
EmpInfo e[]=new EmpInfo[n];
for(int i=0;i<n;i++)
{
	System.out.println("enter the employee "+(i+1)+" details..");
	e[i]=new EmpInfo(new Contact());
	System.out.println("eneter the eid:");
 e[i].eid=s.nextLine();
	System.out.println("eneter the ename:");
	e[i].ename=s.nextLine();
	System.out.println("enter the mail:");
	e[i].ob.email=s.nextLine();
	System.out.println("enter the phoneno:");
	e[i].ob.phoneNo=Long.parseLong(s.nextLine());
}
System.out.println("EMPID"+" "+"ENAME"+" "+" EMAIL"+" "+"EPHONE");
for(EmpInfo k:e)
{
	System.out.println(k.toString());
}
	}

}
