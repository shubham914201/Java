package OopsConcepts;
   class rectangle{
	   int length;
	   int breadth;
   public int area() {
	  return length*breadth;
  }
   public int perimeter() {
	   return 2*(length+breadth);
   }
   }
public class QueSix {
	public static void main(String[] args) {
		rectangle rect= new rectangle();
		rect.length=3;
		rect.breadth=5;
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
	}
	
}
