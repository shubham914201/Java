package doubtQuestions;
import java.util.*;
public class QueOne {
		public static void printDuplicate(int arr1[]) {
			Arrays.sort(arr1);//1,1,2,2,2,3,4,5
			System.out.println("The dublicates are: ");
			for(int i=0;i<arr1.length;i++) {
		    if((arr1[i]==arr1[i+1])){
		    System.out.println(arr1[i]+" ");
		    }
			}
		}
	public static void main(String[] args) {
		int arr1[]={1,2,3,1,4,5,2,2};
		Arrays.sort(arr1);
		printDuplicate(arr1);
	}
	}
