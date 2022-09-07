
//voilation 1 of lsp
//another volation2 -> if each class have it's own implemenation of fly method or eat method
//to resolve this superclass must not implement fly ,each bird must have it's implmentation which can fly
public class LSP {
	
	static class Bird{
		
		public boolean feathers= true;
		
		public void eat() {
			System.out.println("All Birds can Eat Food");
		}
		
		public void fly() {
			System.out.println("Birds can Fly");
		}
		
	}
	
	static class Pigeon extends Bird{
		
		public void walkRound() {
			System.out.println("Pigeon can Walk Round");
		}
	}
	
	static class Sparrow extends Bird{
		
		public void walkStraight() {
			System.out.println("Sparrow can Walk Straight");
		}
	}
	
	static class Penguin extends Bird{
		//here penguin can'tfly ,the lsp get voilated
		//to avoid this make flyable interface and makes the classes implement it and implement fly method
	}
}
