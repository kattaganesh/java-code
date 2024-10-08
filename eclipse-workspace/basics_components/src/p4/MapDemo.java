package p4;
import java.util.*;
import p4.*;
public class MapDemo {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String oname=null;
Map<String,Emp> ob=null;
	try(s;)
	{
		while(true)
		{
			System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.Hashtable")
		;
			System.out.println("enter the choice:");
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:ob=new HashMap<String,Emp>();
			oname="HashMap";
				break;
			case 2:
				ob=new LinkedHashMap<String,Emp>();
				oname="LinkedHashMap";
				break;
			case  3:
				ob=new TreeMap<String,Emp>();
				oname="TreeMap";
				break;
			case 4:
				ob=new Hashtable<String,Emp>();
				oname="Hashtable";
				break;
				
			}
			System.out.println("perform the operations on the "+oname);
			while(true)
			{
				System.out.println("1.put\n2.remove\n3.get\n4.keyset\n5.values");
				System.out.println("enter the choice:");
				switch(Integer.parseInt(s.nextLine()))
				{
				case 1:
					
					System.out.println(ob);
					System.out.println("enter the empid:");
					String eid=s.nextLine();
					System.out.println("enter the ename:");
					String ename=s.nextLine();
					System.out.println("enter the desg:");
					String desg=s.nextLine();
					System.out.println("enter the bsal:");
					int bsal=Integer.parseInt(s.nextLine());
					float tsal=bsal+(0.63F*bsal)+(0.93F*bsal);
					ob.put(eid,new Emp(ename,desg,bsal,tsal));
					ob.forEach((p,q)->{System.out.println(p + "\t" + q);});

					
					
					break;
				case 2:
					if(ob.isEmpty())
					{
						System.out.println("empty....");
					}
					else
					{
						System.out.println(ob);
						System.out.println("enter the empid to remove:");
						String empid=s.nextLine();
						if(ob.containsKey(empid))
						{
							System.out.println(ob.remove(empid));
							
						}
						else {
							System.out.println("empid not found");
						}
					}
					break;
				case 3:
					if(ob.isEmpty())
					{
System.out.println("empty...");
					}
					else
					{
						System.out.println("enter the element to get:");
						String eeid=s.nextLine();
						if(ob.containsKey(eeid))
						{
							Emp e=(Emp)ob.get(eeid);
							System.out.println(e);

						}
						else
						{
							System.out.println("not foud eid");
						}
					}
					break;
				case 4:
					if(ob.isEmpty())
					{
						System.out.println("empty...");
					}
					else
					{
						System.out.println(ob);
						Set<String> set=ob.keySet();
						set.forEach((z)->
						 {
						 System.out.println(z.toString());
						 });
					}
					break;
				case 5:
					if(ob.isEmpty()){
					System.out.println("empty...");
				}
				else
				{
					System.out.println(ob);
					Collection<Emp> coll=ob.values();
					coll.forEach((x)->
					{
						System.out.println(x);
					});
				}
					break;
				case 6:
					break;
					
				
				}
				
			}
			
		}
	}
	
	}

}
