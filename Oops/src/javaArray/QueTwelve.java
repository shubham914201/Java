package javaArray;
public class QueTwelve {
		public static void smallestElement(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		//System.out.println("The maxElement is:"+max);
		}
		System.out.println("The minElement is:"+min);
	}
		public static void main(String[] args) {
			int arr[]= {1,5,2,3,4};
	/*		Arrays.sort(arr);
			System.out.println("The largest element is: "+arr[arr.length-1]);
		}*/
			smallestElement(arr);
		}
	}

