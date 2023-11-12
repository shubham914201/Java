package javaMatrix;
import java.util.*;
public class Quesix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r1,c1,r2,c2;
	boolean flag=true;
	System.out.println("Enter the size of the first matrix: ");
	r1=sc.nextInt();
	c1=sc.nextInt();
	int matrix1[][]=new int[r1][c1];
	for(int i=0;i<matrix1.length;i++) {
		for(int j=0;j<matrix1[0].length;j++) {
			matrix1[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the size of second matrix: ");
	r2=sc.nextInt();
	c2=sc.nextInt();
	int matrix2[][]=new int[r2][c2];
	for(int i=0;i<matrix2.length;i++) {
		for(int j=0;j<matrix2[0].length;j++) {
			matrix2[i][j]=sc.nextInt();
		}
	}
	if(r1!=r2||c1!=c2) {
		System.out.println("The two Matrix are not equal");
	}else {
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[0].length;j++) {
				if(matrix1[i][j]!=matrix2[i][j]) {
					flag=false;
					break;
				}
			}
		}
		   if(flag) {
			   System.out.println("Matrices are equal");
		   }else {
		   System.out.println("Matrices are not equal");
		   }
		}
	}
}
