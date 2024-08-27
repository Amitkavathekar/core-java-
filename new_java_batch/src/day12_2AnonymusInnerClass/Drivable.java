package day12_2AnonymusInnerClass;

public interface Drivable {
public void drive();
}

class car
{
	Drivable c =new Drivable() {
		
		@Override
		public void drive() {
			// TODO Auto-generated method stub
			System.out.println("anonymous class");
		}
	};
}
