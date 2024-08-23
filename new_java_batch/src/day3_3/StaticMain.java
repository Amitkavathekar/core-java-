package day3_3;

public class StaticMain {
	
	public static void main(String[] args) {
		Static s =new Static(123,"sameer",45067.56);
		System.out.println("number of object :"+Static.count);
		Static s1 =new Static(123,"sameer",45067.56);
		System.out.println("number of object :"+Static.count);
		Static s2 =new Static(123,"sameer",45067.56);
		System.out.println("number of object :"+Static.count);
		Static s3 =new Static(123,"sameer",45067.56);
		System.out.println("number of object :"+Static.count);
	}
}
