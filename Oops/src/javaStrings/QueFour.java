package javaStrings;
public class QueFour {
/*public static void main(String[] args) {
	String s="shubham";
	String s1=" ";
	char c;
	int n=s.length();
	//System.out.println(s.charAt(n-1));
	//for(int i=n-1;i>=0;i--) {
		for(int i=0;i<n;i++) {
	//  System.out.println(s1);
	//	System.out.print(s.charAt(i));
		c=s.charAt(i);
	//	s1=s1+c;
		s1=c+s1;
	}
	System.out.println(s1);
}
}*/
	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder();
		String s="shubham";
		String s2=" ";
		int n=s.length();
		for(int i=n-1;i>=0;i--) {
			char c=s.charAt(i);
			s1.append(c);
		}
		System.out.println(s1);
	}
}
