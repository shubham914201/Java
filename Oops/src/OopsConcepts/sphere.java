package OopsConcepts;
public class sphere {
    int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double areaOfSphere() {
		return 4*Math.PI*radius*radius;
	}
	public double volumeOfSphere() {
		return (4*Math.PI*radius*radius*radius)/3;
	}
	public static void main(String[] args) {
		sphere s=new sphere();
		s.setRadius(4);
		System.out.println("radius of sphere is:" +s.getRadius());
		System.out.println("area of sphere is:  " +s.areaOfSphere());
		System.out.println("volume of sphere is:"+ s.volumeOfSphere());
	}
}
