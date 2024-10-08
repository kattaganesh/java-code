package p1;

public class Stringcompare {
public static void main(String args[])
{
	String s1="prp";
	String s2="prp";
	if(s1.compareTo(s2)>0)
	{
		System.out.println("String1 is greater    "+s1);
	}
	else if(s1.compareTo(s2)<0)
	{
		System.out.println("String1 is greater    "+s2);
	}
	else {
		System.out.println("String1 is equal    "+s1+" "+s2);
	}
}
}
