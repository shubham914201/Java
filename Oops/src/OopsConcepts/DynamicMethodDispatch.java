package OopsConcepts;
class Phone{
	public void showTime() {
	System.out.println("Time is 6 pm");
	}
	public void on() {
		System.out.println("Turn on the  Phone");
	}
}
class SmartPhone extends Phone{
	public void music() {
	System.out.println("i am listening the music");
	}
	public void on() {
		System.out.println("turn on the SmartPhone");
	}
}
public class DynamicMethodDispatch {
     public static void main(String[] args) {
	//Phone p=new Phone();
	//SmartPhone s=new SmartPhone();
	//SmartPhone s1=new Phone();
		Phone p1=new SmartPhone();
		p1.showTime();
		p1.on();
	//p1.music();
	}
}
// 1) little bit of doubt
//    why p1.music is not calling
//    what exactly dynamic method dispatch is matlb ye batana kya chahta hai
// 2) method overriding