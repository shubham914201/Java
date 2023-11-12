
public class QueOneee {
   public static void main(String[] args) {
	String s="shubham";
//	String s1="";
//	for(int i=s.length()-1;i>=0;i--) {
//		char c=s.charAt(i);
//		s1=s1+c;
//	}
/*	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
     	s1=c+s1;
	}*/
	StringBuilder s1=new StringBuilder();
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
     	s1.append(c);
	}
	System.out.println(s1);
}
}
