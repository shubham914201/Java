package javaBasics;
import java.util.*;
public class QueOne {
	public static int fib(int count,int n1,int n2) {
		Scanner sc=new Scanner(System.in);
		int n3;
		while(count>0) {
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		count--;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numb till fibonacii is to find: ");
		int count;
		count=sc.nextInt();
		int n1,n2;
		n1=0;
		System.out.println(n1);
		n2=1;
		System.out.println(n2);
		fib(count-2,n1,n2);
		
	}
}
