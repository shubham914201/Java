package javaStrings;
public class QueTwo {
	public static void main(String[] args) {
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String s1="abcdefghijklmnopqrstuvwxyz";
	    String s2="a.b;cdefghijklmnopqrstuvw.x.yz*";
		int count=0;
		for(int i=0;i<s2.length();i++) {
			if((s2.charAt(i)=='.')||(s2.charAt(i)==',')||(s2.charAt(i)==';')||(s2.charAt(i)=='*')) {
		               count++;
				}
			}
		    System.out.println("total number of characters in the string  s is: "+count);
	}
}
