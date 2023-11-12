package javaArray;
import java.util.*;
public class QueTwo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr1[]=new int[10];
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<arr1.length;i++) {
		if(arr1[i]==arr1[i+1]){
			count++;
		}
	}
}
}
