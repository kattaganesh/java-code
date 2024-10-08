package p6p6;
import java.lang.reflect.*;
public class ReflectionApiDemo1 {

	public static void main(String[] args) {
		try {
Class c=Class.forName(args[0]);
//Method[] m=c.getMethods();
Filed[] f=c.getFields();	

for(Field k:f)
		{
			System.out.println(k.toString());
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
