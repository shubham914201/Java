package javaMatrix;
import java.util.*;
public class QueFive {
	/*public static boolean equalMatrix(int matrix1[][],int matrix2[][]) {
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[0].length;j++) {
				if(matrix1[i][j]!=matrix2[i][j]) {
					return false;
				}
			}
			return true;
		}
			return true;
	}*/
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	System.out.println("Enter the size of first matrix: ");
	int n1=sc.nextInt();int m1=sc.nextInt();
	int matrix1[][]=new int[n1][m1];
	for(int i=0;i<matrix1.length;i++) {
		for(int j=0;j<matrix1[0].length;i++) {
		matrix1[i][j]=sc.nextInt();
	}
		System.out.println();
	}
	System.out.println("Enter the size of second matrix: ");
	int n2=sc.nextInt();int m2=sc.nextInt();
	int matrix2[][]=new int[n2][m2];
	for(int i=0;i<matrix2.length;i++) {
		for(int j=0;j<matrix2[0].length;j++) {
			matrix2[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	for(int i=0;i<matrix1.length;i++) {
		for(int j=0;j<matrix1[0].length;j++) {
			if(matrix1[i][j]!=matrix2[i][j]) {
				flag=false;
				break;
			}
		}
	}
	if(flag)
		System.out.println("Matrix are equal");
	else 
		System.out.println("matrix are not equal");
}
}
