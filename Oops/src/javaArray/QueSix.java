package javaArray;
public class QueSix {
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
   public static int[] leftRotate(int arr[],int k) {
	   int start=0;int end=arr.length;
	   reverse(arr,start,k-1);
	   reverse(arr,k,end-1);
	   reverse(arr,start,end-1);
	   return arr;
   }
   public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};//3,4,5,2,1
	int k=2;
	leftRotate(arr,k);
	System.out.print("leftRotate: ");
	for(int i=0;i<arr.length;i++) 
    System.out.print(arr[i]+" ");
	}
}
