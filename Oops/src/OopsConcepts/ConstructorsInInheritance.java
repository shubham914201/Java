package OopsConcepts;
class BaseOne{
	BaseOne(){
	System.out.println("This is the constructor of class BaseOne ");
	}
	BaseOne(int x){
		System.out.println("This is the constructor of class BaseOne with value of x as "+x);
		}
}
class DerivedOne extends BaseOne{
	DerivedOne(){
	System.out.println("this is the constructor of class DerivedOne");
	}
	DerivedOne(int x,int y){
		super(x);
		System.out.println("this is the constructor of class DerivedOne with value of y as "+y);
		}
}
class ChildOfDerivedOne extends DerivedOne{
	ChildOfDerivedOne(){
		System.out.println("This is the constructor of class ChildOfDerivedOne ");
		}
	ChildOfDerivedOne(int x,int y,int z){
		super(x,y);
			System.out.println("This is the constructor of class ChildOfDerivedOne with value of z as"+z);
	}
}
public class ConstructorsInInheritance {
    public static void main(String[] args) {
	//BaseOne b=new BaseOne();
	//BaseOne b1=new BaseOne(1);
	//DerivedOne d=new DerivedOne();
    	ChildOfDerivedOne d1=new ChildOfDerivedOne(1,2,4);
  }
}
