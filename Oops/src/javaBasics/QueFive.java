package javaBasics;
import java.util.*;
public class QueFive {
  /*  public static int amstrongNum(String s) {
    	int sum=0;
    	int n=s.length();
    	int n1=Integer.parseInt(s);*//*here s is string value . 
    	so to convert it to int value , here we are using Integer.parseInt*/
  /*  	for(int i=0;i<n;i++) {
    		char c=s.charAt(i);
    		int a=Character.getNumericValue(c);*//*here c is a character value
    		so to convert it to int value, here we are using Character.getnumericValue*/
   /* 		sum+=Math.pow(a,n);
    	}
    	if(sum==n1) {
    		System.out.println(s+" is a amstrong number");
    	}
    	return sum;
    }/*
  /*  public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    amstrongNum(s);
		
	}*/
	/*public static void count(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
	}*/
	public static void amstrongNum(int n) {
		int n1=n;
		int n2=n;
		int count=0;
		int sum=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		for(int i=0;i<count;i++) {
		int rem=n1%10;
		n1=n1/10;
		sum+=Math.pow(rem,count);
		}
		if(sum==n2) {
			System.out.println(n2+" is the amstrongNum");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		amstrongNum(n);
	}
}
