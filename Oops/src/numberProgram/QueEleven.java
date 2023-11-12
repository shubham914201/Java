package numberProgram;
import  java.util.*;
public class QueEleven {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
 /*   if(n<0) {
    	System.out.println(n+" is negative");
    }if(n>0) {
    	System.out.println(n+" is positive ");
    }if(n==0){
    	System.out.println(n+" is neither positive nor negative");
    }
}
}*/
 /*method 1 if else-if*/
    if(n<0) {
    	System.out.println(n+" is negative");
    }else if(n>0) {
    	System.out.println(n+" is positive ");
    }else{
    	System.out.println(n+" is neither positive nor negative");
    }
}
}
/*	method 2 Math.signum() method
 * double n=sc.nextDouble();
	double result=Math.signum(n);
	System.out.println(result);
	}
}*/ 
	
	/*method 3 Integer.signum() method
	int n=sc.nextInt();
	int result=Integer.signum(n);
	System.out.println(result);
	}
}*/
    
