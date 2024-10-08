package p1;
import java.util.Scanner;
import static java.lang.Math.*;
public class StaticiMPORT {
double cal(double a)
{
	return sqrt(a);
}
	public static void main(String args[])
{
		StaticiMPORT o=new StaticiMPORT();
		Scanner s=new Scanner(System.in);
System.out.println("enter the  number to calculate the sqrt:");
double num=s.nextDouble();
System.out.println(o.cal(num));
s.close();
}
}
