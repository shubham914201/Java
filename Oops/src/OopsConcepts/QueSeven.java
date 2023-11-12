package OopsConcepts;
   class Tommyvecetii{
	   public void hit() {
		   System.out.println("Hitting the enemy");
	   }
	   public void run() {
		   System.out.println("Running from the enemy");
	   }
	   public void fire() {
		   System.out.println("Firing from the enemy");
	   }
   }
public class QueSeven {
     public static void main(String[] args) {
		Tommyvecetii game=new Tommyvecetii();
		game.hit();
		game.run();
		game.fire();
	}
}
