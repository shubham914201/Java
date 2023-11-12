package javaBasics;
import java.util.*;
public class QueTwo {
  public static void isPrime(int n) {
	  if(n<=1){
		  System.out.println(n+"is not prime");
	  }
	  if(n==2) {
		  System.out.println(n+"is prime number");
	  }if(n>2) {
		  for(int i=3;i<n;i++) {
			  if(n%i==0) {
				  break;
			  }else {
				  System.out.println(n+"is the prime number");
			  }
		  }
	  }
  }
	  public static void main(String args[]) {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  isPrime(n);
  }
}
