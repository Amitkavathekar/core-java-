package day11_6innerclass;

public class OuterClass {
	private int old;
	public void funouter() {
		System.out.println("function from outer claass!!!!");
	}
	
	public class Innerclass{
		private int inId;
		public void funInner() {
			System.out.println("outerclass varivale:"+old);
			System.out.println("fuunction from inner class:");
			
			
			
		}
		
	}
}
