package OopsConcepts;
import java.util.*;
public class ShoutOutFour {
	public String[] addbook(String avlBook[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Add the books: ");
    	 for(int i=0;i<avlBook.length;i++) {
    	 avlBook[i]=sc.nextLine();
    	 }
    	 return avlBook;
     }
     public String[] issueBook(String issuebook[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("The issued books are: ");
    	 for(int i=0;i<issuebook.length;i++) {
    	 issuebook[i]=sc.nextLine();
    	 }
    	 return issuebook;
     }
     public String[] returnBook(String returnBook[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("The returned books are: ");
    	 for(int i=0;i< returnBook.length;i++) {
    	 returnBook[i]=sc.nextLine();
    	 }
    	 return returnBook;
     }
     public void showAvailableBook(String avlBook[]) {
    	 System.out.println("The avaliable books are: ");
    	 for(int i=0;i<avlBook.length;i++)
    	 System.out.println(avlBook[i]);
     }
     public static void main(String[] args) {
		ShoutOutFour s=new ShoutOutFour();
		String avlBook[]= new String[10];
		String issueBook[]= new String[30];
		String returnBook[]= new String[30];
		s.addbook(avlBook);
		s.showAvailableBook(avlBook);
		s.issueBook(issueBook);
		s.returnBook(returnBook);
	}
}
