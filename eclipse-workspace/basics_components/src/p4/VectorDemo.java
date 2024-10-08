package p4;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> ob=new Vector<Integer>();
		for(int i=1;i<=10;i++)
		{
			ob.add(new Integer(i));
		}
	System.out.println(ob.elementAt(9));
	System.out.println(ob.firstElement());
	System.out.println(ob.lastElement());
	ob.setElementAt(new Integer(100), 1);
	System.out.println(ob);
	ob.addElement(999);
	System.out.println(ob);
	ob.removeElementAt(1);
	System.out.println(ob);
	ob.removeElement(9);
	System.out.println(ob);
	ob.insertElementAt(9999, 9);
	System.out.println(ob);
	
	System.out.println("get"+ob.get(8));
	ob.removeAllElements();
	System.out.println(ob);
	System.out.println();
	}

}
