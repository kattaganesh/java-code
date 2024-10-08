package p6p6;

import java.util.*;

public class Assignment8 {
	void second(String str,String found)
	{
		int count=0;
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String n=st.nextToken();
			if(n.equals(found))
			{
				count++;
			}
		}
		System.out.println(found+" is found in "+str+"  "+count+" times");
	}
	public static void main(String[] args) {Scanner s=new Scanner(System.in);
	System.out.println("enter the string:");
	String str=s.nextLine().toLowerCase();
	System.out.println("enter the string:");
	String f=s.nextLine().toLowerCase();
new Assignment8().second(str, f);
	}

}
