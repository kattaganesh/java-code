package p1;
import java.util.*;
public class Stringjoinerclass {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the joiner:");
	String dl=s.nextLine();
	StringJoiner sj=new StringJoiner(dl);
	System.out.println("enter the date");
	sj.add(s.nextLine());
	System.out.println("enter the month");
	sj.add(s.nextLine());
	System.out.println("enter the year:");
	sj.add(s.nextLine());
	System.out.println("date:"+sj.toString());
	System.out.println("enter the joiner:");
	String dl1=s.nextLine();
	StringJoiner sj1=new StringJoiner(dl1);
	System.out.println("enter the date");
	sj1.add(s.nextLine());
	System.out.println("enter the month");
	sj1.add(s.nextLine());
	System.out.println("enter the year:");
	sj1.add(s.nextLine());
	System.out.println("date:"+sj1.toString());
	System.out.println(sj+"   to  "+sj1);
	System.out.println(sj.merge(sj1));
	
}
}
