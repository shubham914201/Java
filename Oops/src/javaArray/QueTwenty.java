package javaArray;
public class QueTwenty {
public static void printEven(int arr[]) {
	System.out.println("The even number is:");
	for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.print(arr[i]+" ");
	}
	}
	System.out.println();
}
public static void printOdd(int arr[]) {
System.out.println("The odd number is: ");
for(int j=0;j<arr.length;j++) {
	if(arr[j]%2!=0) {
	System.out.print(arr[j]+" ");
	}
}
}
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	printEven(arr);
	printOdd(arr);
}
}//doubt qno21 , 2
