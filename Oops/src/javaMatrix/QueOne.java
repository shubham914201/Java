package javaMatrix;
import java.util.*;
public class QueOne {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int matrix[][]=new int[4][4];
	int n=matrix.length;int m=matrix[0].length;
	System.out.println("Enter the element: ");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			matrix[i][j]=sc.nextInt();
		}
	}
	System.out.println("Matrix of order"+n+"*"+m+"is");
   for(int i=0;i<n;i++) {
	    for(int j=0;j<m;j++) {
	    	System.out.print(matrix[i][j]+" ");
	     }
	    System.out.println();
       }
   }
   }
