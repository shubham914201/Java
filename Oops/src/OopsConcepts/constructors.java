package OopsConcepts;
public class constructors {
    int id;
    String name;
    public constructors() {
    	id=1234;
    	name="harry";
    }
    public constructors(int id,String name) {
    	this.id=id;
    	this.name=name;
    }
    public constructors(String name) {
    	this.name=name;
    }
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
		//constructors employe=new constructors(12345678,"harry");
		constructors employe=new constructors();
		//employe.setname("harry");
		//employe.setid(12345678);
		System.out.println(employe.name);
		System.out.println(employe.id);
	}
}
