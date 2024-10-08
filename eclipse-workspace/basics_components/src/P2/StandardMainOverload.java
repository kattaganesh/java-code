package P2;

public class StandardMainOverload {

	public static void main(String[] x) {
		StandardMainOverload.main(1111);
		System.out.println("===Standard main =====");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i].toString());
		}
	}
	public static void main(int a)
	{
		System.out.println("===main1====");
		System.out.println("a:"+a);
	}
	public static void main(int a,int b)
	{
		System.out.println("===main1====");
		System.out.println("b:"+b);
	}
	public static void main(int a,int b ,int c)
	{
		System.out.println("===main1====");
		System.out.println("b:"+b);
	}
	

}
