package javaBasics;
import java.util.*;
public class QueFour {
     public static int fact(int n) {
    	 if(n==0||n==1) {
    		 return 1;
    	 }if(n>1) {
    		 return n*fact(n-1);
    	 }
    	 return 0;
     }
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 System.out.println("The factorial of "+n+"is"+fact(n));
	}
}
