package p1;

import java.util.Scanner;
import java.lang.StringBuffer;
public class StringBuffermethods {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		while(true) {
		System.out.println("enter the operions \n 1.append\n2.insert\n3.delete\n4.reverse\5.exit");
		System.out.println("enter the choice:");
		int choice=Integer.parseInt(s.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("enter the string to append..");
			String str=s.nextLine();
			sb.append(str);
			System.out.println(sb);
			break;
		case 2:
			System.out.println("netr the index to insert:");
			int index=Integer.parseInt(s.nextLine());
			if(index>=0 && index<=sb.length()-1)
			{
				System.out.println("enetr the string to insert");
				String st=s.nextLine();
				sb.insert(index, st);
				System.out.println("after insert at "+index+" is:"+sb);
			}
			else
			{
				System.out.println("Index out of bound.....");
			}
			break;
		case 3:
			System.out.println("enter the index to delete the character start:");
			int start=Integer.parseInt(s.nextLine());
			if(start>=0 && start<=sb.length()-1)
			{
				System.out.println("enter the end index:");
				int end=Integer.parseInt(s.nextLine());
			if(end>start && end<sb.length())
			{
				sb.delete(start, end);
				System.out.println("after delete:"+sb);
			}
			else
			{
				System.out.println("end index is out of bound..");
			}
			}
			else
			{
				System.out.println("starting index out of bound ...");
			}
			break;
		case 4:
			if(sb.length()>=0 && sb.length()<sb.length())
			{
				
				System.out.println("reverse"+sb.reverse());
			}
			else
			{
				System.out.println("empty....");
			}
			
			break;
		case 5:System.out.println("The operations to be stopped....");
		System.exit(0);
			break;
			default:
				System.out.println("choice is incorrect");
		}
	}
	}
}
