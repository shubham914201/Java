package numberProgram;
public class QueEight {
	public static int gcdOfNumb(int n1, int n2) {
		if(n2%n1==0) {
			return n1;
		}else {
			int rem=n2%n1;
			return gcdOfNumb(rem,n1);
		}
	}
	public static void main(String[] args) {
		int n1=3;
		int n2=172;
		System.out.println(gcdOfNumb(n1,n2));
	}
}
