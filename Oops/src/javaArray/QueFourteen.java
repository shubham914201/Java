package javaArray;
public class QueFourteen {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int i=0;
		int sum=0;
		while(i<arr.length) {
			sum+=arr[i];
			i++;
		}
		System.out.println("The sum of element is: "+sum);
	}
	}
