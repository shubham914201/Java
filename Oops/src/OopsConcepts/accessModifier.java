package OopsConcepts;
public class accessModifier {
       private int id;
       private String name;
       public void setname(String n) {
    	   this.name=n;
       }
       public void setid(int i) {
    	   this.id=i;
       }
       public String getname() {
    	   return name;
       }
       public int getid() {
    	   return id;
       }
       public static void main(String[] args) {
    	   accessModifier harry=new accessModifier();
    	   harry.setname("harry");
    	   harry.setid(1234);
    	   System.out.println(harry.getname());
    	   System.out.println(harry.getid());
	}
}//doubt what is member function
// classname.methodname for calling the method
//  object.methodname