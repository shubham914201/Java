package javaArray;

import java.util.Arrays;

public class QueThree {
	public static void main(String[] args) {
    int arr[]= {1,2,1,1,3,4,4};
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++) {
    int count=1;
	while(i+1<arr.length&&arr[i]==arr[i+1]) {
			count++;
			i++;
		}
	System.out.println("The freq of "+arr[i]+" is:"+count);
	 }
    }
}
