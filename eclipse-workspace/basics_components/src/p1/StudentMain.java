package p1;
import p1.*;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the branch name CSE/ECE/MECH:");
	String bname=s.nextLine().toUpperCase();
	CheckBr cbr=new CheckBr();
	boolean bnt=cbr.check(bname);
	if(bnt)
	{
		System.out.println("enter the  rollno:");
		String roll=s.nextLine();
		if(roll.length()==10)
		{
			checkbrcode cbc=new checkbrcode();
			String bcode=roll.substring(6,8);
			String bcb=cbc.checkbc(bname);
			System.out.println(bcode);
			System.out.println(bcb);
			if(bcode.equals(bcb))
			{
	System.out.println("enter the s1:");
	int s1=Integer.parseInt(s.nextLine());
			System.out.println("enter the s2:");
	int s2=Integer.parseInt(s.nextLine());
			System.out.println("enter the s3:");
	int s3=Integer.parseInt(s.nextLine());
			System.out.println("enter the s4:");
	int s4=Integer.parseInt(s.nextLine());
			System.out.println("enter the s5:");
	int s5=Integer.parseInt(s.nextLine());
			System.out.println("enter the s6:");
	int s6=Integer.parseInt(s.nextLine());
	boolean pass=false;
	if((s1>=0 && s1<=100) && (s2>=0 && s2<=100) && (s3>=0 && s3<=100) && (s4>=0 && s4<=100) && 
			(s5>=0 && s5<=100) && (s6>=0 && s6<=100) )
	{
		if(s1<=34 || s2<=34 || s3<=34 || s4<=34 || s5<=34 || s6<=34 )
		{
			pass=true;
		}
		TotM tm=new TotM();
		Per per=new Per();
		StudentTotPerrESULT sr=new StudentTotPerrESULT();
		int total=tm.tot(s1, s2, s3, s4, s5, s6);
		float perc=per.per(total);
		String res=sr.result(total, pass);
		
		System.out.println("Total Marks"+total);
		System.out.println("Percentage:"+perc);
		System.out.println("Results..."+res+" With "+perc+"%");
	}
	else
	{
		System.out.println("Please enter the valid marks.........");
	}
	
	}else
	{
		System.out.println("Branch Code is Not Matched.......");
	}
			}
		else 
		{
			System.out.println("Roll no is not entered properly....");
		}
		}
	
	else
	{
		System.out.println("ENter the Branch name properly......");
	}

	}

}
