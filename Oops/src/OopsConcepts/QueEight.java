package OopsConcepts;
    class circle{
    	int radius;
    	public double areaOfCircle() {
    		return 3.14*radius*radius;
    	}
    	public double perimeterOfCircle() {
    		return 2*3.14*radius;
    	}
    }
public class QueEight {
     public static void main(String[] args) {
		circle a =new circle();
		a.radius=4;
		System.out.println(a.areaOfCircle());
		System.out.println(a.perimeterOfCircle());
	}
}
