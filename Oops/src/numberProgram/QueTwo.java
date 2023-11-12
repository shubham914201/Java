package numberProgram;
import java.util.*;
public class QueTwo {
	public static boolean automorphicNumb(int n) {
		int n1=n;
        /*int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}*/
		int rem=0;
		int rem1=0;
		int sqr=n1*n1;
		while(n1>0) {
		rem=n1%10;
		n1=n1/10;
		rem1=sqr%10;
		sqr=sqr/10;
		//System.out.println(rem1);
		/*while(count>0){*/
		if(rem!=rem1) {
			return false;
		}
		//count--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(automorphicNumb(n));
	}

}
