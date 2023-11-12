package OopsConcepts;
class Onee{
	 int a;
	 public int getA() {
	    	return a;
	 }
	 Onee(int a){
	    	this.a=a;
	 }
}
class Two extends Onee{
	Two(int c){
		super(c);
		System.out.println("i am a constructor with value of c as "+c);
	}
}
public class Super {
	public static void main(String[] args) {
	Onee e=new Onee(12);
	Two c=new Two(8);
	System.out.println(c.getA());
	}
}
