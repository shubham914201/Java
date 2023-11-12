package numberProgram;

public class QueFive {
    public static void sqrtOfNumb(int n) {
    	double sqrt=Math.pow(n,0.5);
    	System.out.println("the sqrt of "+n+" is "+sqrt);
    }
    public static void main(String[] args) {
		int n=2;
		sqrtOfNumb(n);
	}
}
