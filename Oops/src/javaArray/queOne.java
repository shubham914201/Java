package javaArray;
import java.util.*;
public class queOne {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr1[]=new int[10];
	int arr2[]=new int[10];
	System.out.print("Enter elements:");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("Elements of arr2 after copying elements of arr1: ");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=arr1[i];
		System.out.print(" "+arr2[i]);
	}
}
}
