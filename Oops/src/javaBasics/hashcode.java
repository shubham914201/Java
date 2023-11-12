package javaBasics;
//import java.util.*;
class employe{
	private String name;
	private int regdNo;
	public employe(String name,int regdNo) {
		this.name=name;
		this.regdNo=regdNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegdNo() {
		return regdNo;
	}
	public void setRegdNo(int regdNo) {
		this.regdNo = regdNo;
	}
}
public class hashcode {
	public static void main(String[] args) {
	employe e1=new employe("maheswar",123);
	employe e2=new employe("maheswar",123);
	int a=e1.hashCode();
	int b=e2.hashCode();
	System.out.println("The hashcode value of a is "+a);
	System.out.println("the hashcode value of b is "+b);
	System.out.println("comparing objects of a and b "+e1.equals(e2));
	}
}
