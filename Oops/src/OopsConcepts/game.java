package OopsConcepts;
import java.util.*;
 public class game{
    	int userInput;
    	int gusses;
    	int randomNumber;
    	int computerInput;
         game() {
         randomNumber=(int)Math.random();
         System.out.println(randomNumber);
    }
    public int userInput() {
    	Scanner sc=new Scanner(System.in);
    	userInput=sc.nextInt();
    	return userInput;
    }
    public void setNumOfGusses() {
    	this.gusses=userInput;
    }
    public int getNumOfGusses() {
    	return gusses;
    }
    public void isCorrectNum() {
    	if(randomNumber>userInput) {
    		System.out.println("number is less than randomNumber");
    	} else if(randomNumber<userInput){
    		System.out.println("number is greater than randomNumber");
    	}else {
    	System.out.println("The number entered is a correct number");
    	}
    }
    public static void main(String[] args) {
		game g =new game();
		//g.game();
		//System.out.println("randomNum: "+g.game());
        System.out.println("userinput: "+g.userInput());
        g.getNumOfGusses();
        g.isCorrectNum();
    }
 }
/*public class ShoutOutTwo {
        
}*/
