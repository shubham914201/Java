package javaBasics;
import java.util.Random;
public class Quesix {
	//Method 1 Math.random() method
   /* public static void main(String[] args) {
		//int x=10;
		System.out.println("random value is "+Math.random());
	}*/
	//Method 2 Random number b/w two numbers
	/*public static void main(String[] args) {
		int min=200;
		int max=400;
		double a=Math.random()*(max-min+1)+min;
		int b=(int)(Math.random()*(max-min+1)+min);
		System.out.println("The random value of a is "+a);
		System.out.println("the random value of b is "+b);
	}*/
	//Method 3 random using random class
	/*public static void main(String[] args) {
		Random random= new Random();
		int x=random.nextInt(10);
		int y=random.nextInt(100);
		System.out.println("The random value of x is "+x);
		System.out.println("the random value of y is "+y);
	}*/
}
