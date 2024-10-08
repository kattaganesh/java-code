package p3;

public class SingleTonClasses {

	public static void main(String[] args) {
	private static SingleTonClasses ob=null;	
private SingleTonClasses()
{
	
}
public static SingleTonClasses m1()
{
	return ob;
}
	}

}
