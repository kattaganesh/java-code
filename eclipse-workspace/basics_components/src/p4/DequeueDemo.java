package p4;

import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class DequeueDemo {

	public static void main(String[] args) {
		Deque<Integer> ob=new LinkedList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println(ob);
		ob.addFirst(10);
		System.out.println(ob);
		System.out.println();
		ob.addLast(20);
		System.out.println(ob);
		System.out.println(ob.peekFirst());
		
		System.out.println(ob.peekLast());
		ob.offerFirst(40);
		System.out.println(ob);
		ob.offerLast(50);
		System.out.println(ob);
		System.out.println(ob.getFirst());
		System.out.println(ob.getLast());
		System.out.println(ob.pollFirst());
		System.out.println(ob.pollLast());
		ob.removeFirstOccurrence(30);
		System.out.println(ob);
		ob.removeLastOccurrence(40);
		System.out.println();
		System.out.println();
		
	}

}
