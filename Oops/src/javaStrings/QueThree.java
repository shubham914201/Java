package javaStrings;
public class QueThree {
public static void main(String[] args) {
	String str="APPLE";
	int length=str.length();
	System.out.println("The subset of the string str:  ");
	for(int i=0;i<length;i++) {
		for(int j=i;j<length;j++) {
			System.out.println(str.substring(i,j+1));
		}
	}
}
}
