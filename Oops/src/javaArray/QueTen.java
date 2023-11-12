package javaArray;
public class QueTen {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("element of the array present on odd pos: ");
		for(int i=0;i<=arr.length;i+=2) {
	        System.out.print(arr[i]+" ");
			}
		}
	}
