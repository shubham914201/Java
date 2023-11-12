package numberProgram;
import java.util.*;
public class queOne {
  /* public static void reverseNumb() {
	   String s="123";
	   System.out.println("The reverse of "+s+" is ");
	   for(int i=s.length()-1;i>=0;i--) {
	   char c=s.charAt(i);
	   System.out.print(c);
	   }
   }
   public static void main(String[] args) {
	reverseNumb();
}*/
	   public static void reverseNumb(int n) {
		   int count=0;
		   int n1=n;
		   while(n>0) {
			  n=n/10;
			  count++;
		   }
		   System.out.println("The reverse of the number"+n1+" is");
		   for(int i=0;i<count;i++) {
			   int rem=n1%10;
			   n1=n1/10;
			   System.out.print(rem);
		   }
		}
	   public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   reverseNumb(n);
	}
}
