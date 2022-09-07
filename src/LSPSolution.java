
public class LSPSolution {

static class Bird{
		
		public boolean feathers= true;
		
		public void eat() {
			System.out.println("All Birds can Eat Food");
		}
		
	}
	
	static class Pigeon extends Bird implements Flyable{
		
		public void walkRound() {
			System.out.println("Pigeon can Walk Round");
		}

		@Override
		public void fly() {
			System.out.println("Pigeon can fly");
			
		}
	}
	
	static class Sparrow extends Bird implements Flyable{
		
		public void walkStraight() {
			System.out.println("Sparrow can Walk Straight");
		}

		@Override
		public void fly() {
			System.out.println("Sparrow can fly");
			
		}
	}
	
	static class Penguin extends Bird{
		
	}
	
	public static void main(String args[]) {
		
		Pigeon pig= new Pigeon();
		pig.eat();
		pig.fly();
	}
}
