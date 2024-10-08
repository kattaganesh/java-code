package p1;
import p1.*;
public class EmpInfo {
String eid,ename;
Contact obc;
public EmpInfo(Contact c)
{
	
			obc=c;
}
public String toString()
{
	return eid+"\t"+ename+"\t"+obc.email+"\t"+obc.phoneNo;
}
}
