package practice;
public class QueTwo {
	public static int reverse(int a) {
		int rem;
		int reverse = 0;
		while(a>0){
			rem=a%10;
			a=a/10;
			reverse=  reverse*10+rem;
		}
		return reverse;
	}
  public static void main(String[] args) {
	int a=2134;
	System.out.println(reverse(a));
  }
}
