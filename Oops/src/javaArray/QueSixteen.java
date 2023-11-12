package javaArray;
public class QueSixteen {
		public static int[] reverse(int arr[],int start,int end) {
			while(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
			return arr;
		}
	   public static int[] rightRotate(int arr[],int k) {
		   int start=0;int end=arr.length;
		   reverse(arr,start,end-1);
		   reverse(arr,0,k-1);
		   reverse(arr,k
				   ,end-1);
		   return arr;
	   }
	   public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};//3,4,5,2,1
		int k=2;
		rightRotate(arr,k);
		System.out.print("rightRotate: ");
		for(int i=0;i<arr.length;i++) 
	    System.out.print(arr[i]+" ");
		}
	}
