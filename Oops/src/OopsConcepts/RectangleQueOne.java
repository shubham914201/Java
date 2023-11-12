package OopsConcepts;
public class RectangleQueOne {
		   private    int length;
		   private    int breadth;
		       public RectangleQueOne() {
		    	   this.length=4;
		           this.breadth=3;			   
		       }
			public RectangleQueOne(int length, int breadth) {
				super();
				this.length = length;
				this.breadth = breadth;
			}
			public int getLength() {
				return length;
			}
			public int getBreadth() {
				return breadth;
			}
		       public static void main(String[] args) {
				RectangleQueOne r=new RectangleQueOne(12,10);
				System.out.println(r.getLength());
				System.out.println(r.getBreadth());
			}
		}
