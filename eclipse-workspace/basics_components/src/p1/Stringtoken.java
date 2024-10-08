package p1;

import java.util.*;

public class Stringtoken {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string to tokenizer:");
		String str=s.nextLine();
		
	StringTokenizer st=new StringTokenizer(str," ");
	System.out.println("count:"+st.countTokens());
	while(st.hasMoreTokens())
	{
	String sn=st.nextToken();
	StringBuffer sb=new StringBuffer(sn);
	
	System.out.print(sb.reverse()+" ");
	
	}
	System.out.println("count:"+st.countTokens());

	}

}
