package day11_6innerclass;

public class Mainapp {

	public static void main(String[] args) {
		OuterClass outerClass =new OuterClass();
		outerClass.funouter();
		
		OuterClass.Innerclass in=outerClass.new Innerclass();
		in.funInner();
		}
}
