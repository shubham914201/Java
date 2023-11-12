package javaArray;
import java.util.*;
public class QueNinteen {
public static void main(String[] args) {
	int arr[]= {2,4,6,5,7,4,3,2};
//meth-1
//	ArrayList<Integer>list=new ArrayList<Integer>();
//	for(int i=0;i<arr.length;i++)
//	if(!list.contains(arr[i])) {
//		list.add(arr[i]);
//	}
//meth-2
	Set<Integer>list=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++) {
		list.add(arr[i]);
}
	System.out.println(list);
}
}
