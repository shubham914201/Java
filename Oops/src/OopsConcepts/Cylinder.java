// here we are using getters & setters to take radius ,height,area,perimeter
package OopsConcepts;
public class Cylinder {
    int radius;
    int height;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	// parameterized constructor
	public Cylinder(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double SurfaceArea() {
		return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
	}
	public double volume() {
		return Math.PI*radius*radius*height;
	}
	public static void main(String[] args) {
		Cylinder cy=new Cylinder(3,8);
	/*  cy.setRadius(10);
		System.out.println(cy.getRadius());
   		cy.setHeight(10);
		System.out.println(cy.getHeight());*/
		System.out.println(cy.SurfaceArea());
		System.out.println(cy.volume());
	}
}