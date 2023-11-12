package javaMatrix;
import java.util.*;
public class QueTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("Enter the size of matrix: ");
		n=sc.nextInt();m=sc.nextInt();
		int matrix1[][]=new int[n][m];
		int matrix2[][]=new int[n][m];
		int matrix3[][]=new int[n][m];
		System.out.println("Enter the first matrix: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				matrix1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Ente the second  matrix: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				matrix2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(	matrix2[i][j]);
			}
		System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}

		System.out.println("the sum of two matrices is: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
		System.out.println();
		}
	}
}
