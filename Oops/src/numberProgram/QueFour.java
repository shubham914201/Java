package numberProgram;
import java.util.*;
public class QueFour {
	
    public static boolean  isPrime(int n) {
    	if(n==1) {
    		return false;//System.out.println(n+" is not prime");
    	}if(n==2) {
    		return true;//System.out.println(n+" is a prime number");
    	}
    	for(int i=3;i<n;i++ ) {
    		if(n%i==0) {
    			return false;
    			//System.out.println(n+" is not prime");
    		}
    	}
    	return true;
    	}
    public static void nthPrime(int n) {
    	int count=0;
    	for(int i=0;i<n*n;i++) {
    		if(isPrime(i)) {
    			count++;
    		}
    		if(count==n) {
    			System.out.println("the nth prime is "+i);
    		}
    	}
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	System.out.println(isPrime(n));
	nthPrime(n);
	}
}
