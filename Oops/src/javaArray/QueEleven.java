package javaArray;
import java.util.Arrays;
public class QueEleven {
	public static void largestElement(int arr[]) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
	//System.out.println("The maxElement is:"+max);
	}
	System.out.println("The maxElement is:"+max);
}
	public static void main(String[] args) {
		int arr[]= {1,5,2,3,4};
/*		Arrays.sort(arr);
		System.out.println("The largest element is: "+arr[arr.length-1]);
	}*/
		largestElement(arr);
	}
}
