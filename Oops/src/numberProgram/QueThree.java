package numberProgram;
import java.util.*;
public class QueThree {
	public static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		if(n>1) {
			return n*fact(n-1);
		}
		return 0;
	}
	public static void petersonNumber(int n) {
		int n1=n;
		int sum=0;
		int rem=0;
		int factOfDigit;
		while(n>0) {
			rem=n%10;
			n=n/10;
	        factOfDigit=fact(rem);
	       // System.out.println(factOfDigit);
			sum=sum+factOfDigit;
		}
		System.out.println("sum :"+sum);
		if(sum==n1) {
			System.out.println(n1+" is the peterson number");
		}
		else {
			System.out.println(n1+" is not the peterson number");
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();	
	petersonNumber(n);
	}
}
