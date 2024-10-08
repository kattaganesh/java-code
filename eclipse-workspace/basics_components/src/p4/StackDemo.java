package p4;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
Stack<Integer> ob=new Stack<Integer>();
Scanner s=new Scanner(System.in);
try(s;)
{
	while(true)
	{
		System.out.println("1.push\n2.pop\n3.peek\n4.empty\n5.serach");
		System.out.println("enter the choice:");
		switch(s.nextInt())
		{
		case 1:
			System.out.println(ob);
			System.out.println("enter the elements to push:");
			ob.push(s.nextInt());
			System.out.println(ob);
			break;
		case 2:
			if(ob.size()==0)
			{
				System.out.println("empty......");
			}
			else {
				System.out.println(ob);
				ob.pop();
				System.out.println(ob);
			}
			break;
		case 3:
			if(ob.size()==0)
			{
				System.out.println("empty......");
			}
			else {
				System.out.println(ob);
				
				System.out.println(ob.peek());
			}
			break;
		case 4:
			
			break;
		case 5:
			if(ob.size()==0)
			{
				System.out.println("empty......");
			}
			else {
				System.out.println(ob);
				System.out.println("enter the element to search:");
int pos=ob.search(s.nextInt());
if(pos>0)
{
	System.out.println("elemetn at:"+ pos+" index found");
}
else
{
	System.out.println("elemetn not found...");
	
}
			}
			break;
		}
	}
}
	}

}
