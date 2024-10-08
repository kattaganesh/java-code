package p5;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) {
System.out.println("enter the number:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
	sum=sum+i;
}
System.out.println(sum);
	}

}
