package javaStrings;
public class QueFive {
public static void main(String[] args) {
	String s=new String("asdf qweraf");
	char ch[]=s.toCharArray();
	System.out.println("The dublicate characters are: ");
	/*for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)){
				System.out.println(s.charAt(i));
			}
		}
	}*/
	//-System.out.println("The dublicate characters are: ");
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]){
				System.out.println(ch[i]);
}
}
}
}
}
