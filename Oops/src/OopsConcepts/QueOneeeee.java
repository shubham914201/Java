package OopsConcepts;
class employe{
	int id;
	String name;
	int salary;
	public void printDetails() {
	System.out.println("My id is "+id);
	System.out.println("& My name is "+name);
	}
	public int getsalary() {
		return salary;
	}
}
public class QueOneeeee {
 public static void main(String[] args) {
	employe harry=new employe();
	employe abc=new employe();
	harry.id=1222;
	harry.name="Harry";
	harry.salary=1234;
	abc.id=1223;
	abc.name="abc";
	abc.salary=1278;
	harry.printDetails();
	abc.printDetails();
	int salary=abc.getsalary();
	System.out.println("My salary is "+salary);
	
}
}
/*In Oops concept, we deal with objects and classes
 * class- we can say class is a template
 *OR collection of objects is called class
 *Object-object is the instance of the class(example--phone,keyboard,mouse,tiger)
 *object contains address and takes space in the memory
 *tiger is an object since it has state such as color,breed,name and it has behaviour such as moving tail,barking,eating
 * there are 4 types of concepts in OOPS
 *-- inheritance
 *-- abstraction
 *-- encapsulation 
 *--  polymorphism
 *-- custom class (doubt)
*/