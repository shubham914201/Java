package javaArray;
import java.util.*;
public class QueSeventeen {
	public static void main(String[] args) {
		int arr[]= {1,5,4,3,2,};
		Arrays.sort(arr);
		for(int i=arr.length;i>0;i--) {
			int j=3;
			if(i==j) {
				System.out.println("The second largest element is: "+arr[i]);
			}
		}
	}
	}
