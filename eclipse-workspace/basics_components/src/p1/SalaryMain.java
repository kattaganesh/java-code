package p1;
import p1.basicDetails;
import java.util.*;
public class SalaryMain {
	public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("eneter the bsal:");
float bsalary=s.nextFloat();
basicDetails o=new basicDetails();
float ts=o.basicSal(bsalary);
float tss=o.basicSal(bsalary);
System.out.println("calculated total: "+ts+tss);

	}
}
