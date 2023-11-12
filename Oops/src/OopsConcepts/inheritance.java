package OopsConcepts;
class base{
public int x;

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}
}
class derived extends base{
public	int y;

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
}
public class inheritance {
    public static void main(String[] args) {
		base b=new base();
		b.setX(12);
		System.out.println("The value of x is:"+b.getX());
		derived d=new derived();
		//d.setX(12);
        d.setY(1234);
        System.out.println("The value of y is:"+d.getY());
	}
}
