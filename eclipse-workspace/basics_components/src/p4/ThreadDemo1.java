package p4;

public class ThreadDemo1 {

	public static void main(String[] args) {
Register ob1=new Register();
Login ob2=new Login();
Thread t1=new Thread(ob1);
Thread t2=new Thread(ob2);

t1.setName("User Prashanth");
t2.setName("User Virat");

t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.NORM_PRIORITY);






t1.start();
t2.start();
	}

}
