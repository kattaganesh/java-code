package p3;

public class NullExceptiojn {
@SuppressWarnings//this  annotation used to provide the information to the compiler to close the raised warnings
@Override
//
	public static void main(String[] args) {
		int a="0";
		int b=0;
		double d=a/b;
		try
		{
			System.out.println(d);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
