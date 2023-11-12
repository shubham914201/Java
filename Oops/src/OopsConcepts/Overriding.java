package OopsConcepts;
class A{
	public int a;
	public int harry() {
		return 4;
	}
	public void meth2() {
		System.out.println("this is the method of class A");
	}
}
	class B extends A{
		
		public void meth2() {
			System.out.println("this is the method of class B");
		}
	}
public class Overriding {
      public static void main(String[] args) {
	  A a =new A();
	  a.meth2();
	  B b=new B();
	  b.meth2();
}
}