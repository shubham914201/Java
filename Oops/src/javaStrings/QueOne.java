package javaStrings;
public class QueOne {
public static void main(String[] args) {
	String s="orange is rich in vitamin c";
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
	    count++;
		}
	}
	System.out.println("total number of characters in the string  s is: "+count);
}
}
