package p1;
import p1.ResultBean;
import java.io.Serializable;

public class ResultBean implements Serializable{

	private int hno;
	private String sname;
	private int c;
	private int java;
	private int cpp;
	private int oracle;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getCpp() {
		return cpp;
	}
	public void setCpp(int cpp) {
		this.cpp = cpp;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	
}
