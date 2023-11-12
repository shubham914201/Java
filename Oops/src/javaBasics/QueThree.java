package javaBasics;
import java.util.*;
public class QueThree {
    public static void checkPalindrome(String num) {
    	char c;
    	for(int i=0;i<num.length();i++) {
    		if(num.charAt(i)!=num.charAt(num.length()-1-i)) {
    			System.out.println(num+" is not palindrome");
    		}
    	}
    	System.out.println(num+" is palindrome");
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		checkPalindrome(num);
	}
}
