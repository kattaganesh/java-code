package p1;
import p1.Employee;
import java.util.*;
public class EmpoyeeMain {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no.of empoyees");
int n=Integer.parseInt(s.nextLine())
;
Employee[] e=new Employee[n];
System.out.println("enter the "+n+" details");
for(int i=0;i<n;i++)
{
	e[i]=new Employee();
	System.out.println("enetr the eid:");
	e[i].eid=s.nextLine();
	System.out.println("enetr the ename:");
	e[i].ename=s.nextLine();
	System.out.println("enetr the bsal:");
	e[i].bSal=Integer.parseInt(s.nextLine());


	
	
}
Arrays.sort(e);
for(Employee k:e)
{
	System.out.println(k.toString());
}



	}

}
