package p1;
import p1.*;
public class ObjectArrayEx {

	public static void main(String[] args) {
Object o[]=new Object[3];
o[0]=new Integer(12);
o[1]=new Employee();
o[2]=new String("Prasahnth");
for(Object oa:o)
{
	System.out.println(oa.toString());
}
		
		
	}

}
