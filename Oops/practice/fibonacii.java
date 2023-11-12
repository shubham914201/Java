package practice;
public class fibonacii{
    public  static void fibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibo(b, c, n-1);
    }
	public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=8;
        System.out.println(a);
        System.out.println(b);
        fibo(a, b, n-2);
    }
	
}
//top 5 Ques from every topic // arrays & string
// github setup