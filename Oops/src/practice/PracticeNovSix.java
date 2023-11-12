package practice;
public class PracticeNovSix {
 public static class Person{
		String name;
		int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
public static void main(String[] args) {
	Person p1=new Person();
	p1.setName("Shubham");
	p1.setAge(20);
	Person p2=new Person();
	p2.setName("Abhi");
	p2.setAge(24);
}
}
