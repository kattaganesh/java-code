package p1;
import java.util.*;
public class SetterGetter {
int id,deptno;
String ename;
float sal;
void setIdd(int id)
{
	this.id=id;
}
void setDeptno(int deptno)
{
	this.deptno=deptno;
}
void setEname(String enaame)
{
	this.ename=enaame;
}
void setSal(float sal)
{
	this.sal=sal;
}
int getId()
{
	return id;
}
int getDepttno()
{
	return deptno;
}
String getEname()
{
	return ename;
}
float getSal()
{
	return sal;
}

	
	
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		SetterGetter sm= new SetterGetter();
		System.out.println("eneter the deptno:");
		sm.setDeptno(Integer.parseInt(s.nextLine()));
		System.out.println("eneter the ename:");
		sm.setEname(s.nextLine());
		System.out.println("eneter the empid:");
		sm.setIdd(Integer.parseInt(s.nextLine()));
		System.out.println("eneter the empid:");
		sm.setSal(Float.parseFloat(s.nextLine()));
		
		
		System.out.println("==basic details====");
		System.out.println("eneter the deptno:"+sm.getId());
		System.out.println("eneter the deptno:"+sm.getDepttno());
		System.out.println("eneter the deptno:"+sm.getEname());
		System.out.println("eneter the deptno:"+sm.getSal());
		
	}
}
