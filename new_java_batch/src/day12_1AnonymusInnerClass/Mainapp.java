package day12_1AnonymusInnerClass;

public class Mainapp {

	public static void main(String[] args) {
	Readable r = new Readable() {

		@Override
		public void read1() {
			System.out.println("read data from read 1 function");	
		}

		@Override
		public void read2() {
			System.out.println("read data from read 2 function");
						
		}
	};
	r.read1();
	r.read2();
	}
}
