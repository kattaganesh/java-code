package p3;
import P2.AddIC;
import java.lang.Class;
public class RuntimeMain {

	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException{
Class c=Class.forName("P2.AddIC");
	P2.AddIC ob=(P2.AddIC)c.newInstance();
	ob.cal(1,2);
	}

}
