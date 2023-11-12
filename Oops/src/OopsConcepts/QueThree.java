package OopsConcepts;
class employe1{
	int salary;
	String name;
	public void setName(String n) {
		name=n;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
}
public class QueThree {
    public static void main(String[] args) {
		employe1 harry = new employe1();
		harry.setName("saurabhkumar");
		System.out.println(harry.getName());
		harry.salary=145;
		System.out.println(harry.getSalary());
	}
}
