package p3;
import p3.*;
public class GenerationProcessMain {
	public static void main(String args[]) {
Pclass po=(Pclass) new Cclass();
po.m1(111);
po.m2(222);
Itest i=(Itest)new Iclass();
i.m(222);
i.mm(3333);
Aclass a=(Aclass)new Eclass();
a.m1(5555);
a.m2(777);
//a.mmm();

//specialization
Cclass c=(Cclass)new Pclass();
c.m1(11111);
c.m2(2222);
c.mmm();


//Iclass ic=(Iclass)new Itest();
//Eclass ec=(Eclass)new Aclass();
	}
}