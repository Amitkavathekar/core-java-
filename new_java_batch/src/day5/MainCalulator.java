package day5;

public class MainCalulator {

	public static void main(String[] args) {	
		Calculator c=new Calculator();
		
		double p1=c.calculateVolume(2);
		System.out.println("Cylinder Volume :"+p1);
		double p2=c.calculateVolume(2, 3, 4);
		System.out.println("Cuboid Volume :"+p2);
		
		
	}
}