package p3;
import p3.*;
public class RefMain {

	public static void main(String[] args) {
		Iref ob1=ClassRef :: new;//reference to constructor
		ob1.m1(121);
		ClassRef c=new ClassRef(2222);
Iref ob2=c::dis;
ob2.m1(777);
Iref ob3=ClassRef::show;
ob3.m1(0);

	}

}
//the process in ewhich tyhe abstract method of the functional intercae which is atteched with the metod body from a class and 
//the class is not related to the interface functional