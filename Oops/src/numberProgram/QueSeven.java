package numberProgram;
public class QueSeven {
    public static void swapOfNumb(int a,int b) {
         int c;
         c=a^b;//111=010^101
         b=b^c;//101^111=010
         a=b^c;//010^111=101
         System.out.println("The value of a and b after swaping is "+"a:"+a+" b:"+b);
    }
    public static void main(String[] args) {
		int a=2;
		int b=5;
		System.out.println("the value a and b before swapping is "+"a:"+a+" b:"+b);
		swapOfNumb(a,b);
	}
}//doubt que 25,26,27
