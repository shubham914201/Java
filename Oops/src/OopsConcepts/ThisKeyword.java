package OopsConcepts;
class One{
	int a;
	public int getA() {
		return a;
	}
	One(int a){
		this.a=a;
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		One e=new One(12);
		System.out.println(e.getA());
	}
}
