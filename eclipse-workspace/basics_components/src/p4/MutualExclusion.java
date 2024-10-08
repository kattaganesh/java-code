package p4;

public class MutualExclusion {

	public static void main(String[] args) {
Printer p=new Printer();
UserOne ob1=new UserOne(p);
UserTwo ob2=new UserTwo(p);

Thread t1=new Thread(ob1);
Thread t2=new Thread(ob2);

t1.start();
t2.start();


	}

}
