package p1;

import java.io.Serializable;

public class EmpJavaBeanClass implements Serializable{
private String eid,ename;
private float esal;
public void setEid(String eid)
{
	this.eid=eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public float getEsal() {
	return esal;
}
public void setEsal(float esal) {
	this.esal = esal;
}
public String getEid() {
	return eid;
}
}
