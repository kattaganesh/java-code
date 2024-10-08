package p3;

public class Iclasss {
public static void main(String args[])
{
	Itest ob=new Itest()
			{
		public void m(int m)
		{
			System.out.println("IC m(m)");
			System.out.println("m:"+m);
		}
		public void m11(int m)
		{
			System.out.println("IC m11(m)");
			System.out.println("m:"+m);
		}
			};
			ob.m(111);
			//ob.m11(222);
}
}
