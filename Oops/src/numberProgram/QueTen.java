package numberProgram;
import java.util.*;
public class QueTen {
	int a,b,c,temp,smallest;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c,temp,smallest;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	temp=a<b?a:b;
	smallest=c<temp?c:temp;
	System.out.println("The smallest among three numbers is "+smallest);
}
}
	/*if((a<=b)&&(a<=c)) {
		System.out.println(a+" is smallest");
	}
  	else if((b<a)&&(b<c)) {
		System.out.println(b+" is smallest");
	}else {
		System.out.println(c+" is smallest");
	}
}
}
	if(a<b) {
		if(a<c) {
			System.out.println(a+" is the smallest");
		}else {
			System.out.println(c+" is the smallest");
		}
	}else {
		if(b<c) {
			System.out.println(b+" is the smallest");
		}else {
			System.out.println(c+" is the smallest");
		}
	}
}
}*/
