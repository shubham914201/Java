package javaArray;
	import java.util.Arrays;
	public class QueEighteen {
	public static void main(String[] args) {
		int arr[]= {1,5,4,3,2,};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int j=1;
			if(i==j) {
				System.out.println("The second smallest element is: "+arr[i]);
			}
		}
	}
	}
