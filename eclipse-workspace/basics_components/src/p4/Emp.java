package p4;

public class Emp {
public String name,desg;
public int bSal;
float totSal;
public Emp(String name,String desg,int bSalary,float tsal)
{
	this.name=name;
	this.desg=desg;
	this.bSal=bSalary;
	this.totSal=tsal;
}
public String toString()
{
	return name+"\t"+desg+"\t"+bSal+"\t"+totSal;
}
}
