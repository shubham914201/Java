package javaArray;
import java.util.Arrays;
public class QueFifteen {
public static void main(String[] args) {
	int arr[]= {1,5,4,3,2,};
	Arrays.sort(arr);
	for(int i=arr.length-1;i>0;i--) {
		int j=2;
		if(i==j) {
			System.out.println("The third largest element is: "+arr[i]);
		}
	}
}
}
