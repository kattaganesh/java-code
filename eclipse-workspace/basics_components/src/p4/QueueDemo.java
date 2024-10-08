package p4;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
Queue<Integer> ob=new PriorityQueue<Integer>();
Scanner s=new Scanner(System.in);
try(s;)
{
	while(true)
	{
		System.out.println("1.add\n2.remove\n3.poll\n4.element\n5.offer\6.peek");
		System.out.println("enter the choice:");
		switch(s.nextInt())
		{
		case 1:
			System.out.println(ob);
			System.out.println("enter the elemetn:");
			ob.add(s.nextInt());
			System.out.println(ob);
			break;
		case 2:
			if(ob.size()==0)
			{
				System.out.println("empty...");
			}
			else
			{
				System.out.println(ob);
				System.out.println("enter the eelment:");
				System.out.println(ob.remove(s.nextInt()));
				System.out.println(ob);
			}
			break;
		case 3:
			if(ob.size()==0)
			{
				System.out.println("empty...");
			}
			else
			{
				System.out.println(ob);
				System.out.println(ob.poll());
				System.out.println(ob);
			}
			break;
		case 4:
			if(ob.size()==0)
			{
				System.out.println("empty");
			}
			else
			{
				System.out.println(ob);
				System.out.println(ob.element());
				System.out.println(ob);
			}
			break;
		case 5:
			if(ob.size()==0)
			{
				System.out.println("empty...");
			}
			else {
				
				System.out.println(ob);
				System.out.println("enter the lement:");
				System.out.println(ob.offer(s.nextInt()));
				System.out.println(ob);
			}
			break;
		case 6:
			if(ob.size()==0)
			{
				System.out.println("empty...");
			}
			else
			{
				System.out.println(ob);
				System.out.println(ob.peek());
			}
			break;
			
		}
	}
}
	}

}
