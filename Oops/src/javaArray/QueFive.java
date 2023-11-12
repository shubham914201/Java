package javaArray;
import java.util.Arrays;
public class QueFive {
	public static boolean containsduplicate(int arr1[]) {
		Arrays.sort(arr1);//1,1,2,2,2,3,4,5
		for(int i=0;i<arr1.length;i++) {
		int count=0;
	    if((arr1[i]==arr1[i+1])){
	     return true;//System.out.println("The dublicates are: "+arr1[i]);
	    }
		}
		return false;
	}
public static void main(String[] args) {
	int arr1[]={1,2,3,1,4,5,2,2};
	Arrays.sort(arr1);
	System.out.println("The dublicates are: "+containsduplicate(arr1));
}
}
