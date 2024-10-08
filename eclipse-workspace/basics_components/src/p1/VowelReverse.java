package p1;
import java.util.*;
import java.util.Scanner;

public class VowelReverse {

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
		
		for(int i=0;i<n;i++)
		{
			StringTokenizer st=new StringTokenizer(a[i]," ");
			while(st.hasMoreTokens()) {
				String str=st.nextToken();
				StringBuffer sb=new StringBuffer(str);
			switch(sb.charAt(0))
			{
			case 'a':
			case 'A':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
			case 'e':
			case 'E':
				sb.reverse();
				System.out.print(sb+" ");
				break;
				default:
					System.out.print(str+" ");
			}}
		System.out.println();
		}
		
	}

}
