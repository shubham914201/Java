package practice;
public class Palindrome {
     public static void palindrome(String a) {
    	 boolean flag=false;
    	 for(int i=0;i<a.length()/2;i++) {
    		 for(int j=a.length()-1;j>a.length()/2;j--) {
    			 if(a.charAt(i)!=a.charAt(j)) {
    				 
    				 System.out.println(a+"is not a palindrome");
    				 flag=true;
    				 break;
    			 }
    		 }
    		 
    	 }
    	 if(flag==false) {
    		 System.out.println(a+"is a palindrome");
    	 }
     }
     public static void main(String[] args) {
		String name = "madam";
		palindrome(name);
	}
}
