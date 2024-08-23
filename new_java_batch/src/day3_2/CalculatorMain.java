package day3_2;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Addition c = new Addition();
		
		double add1 =c.add(34,23.89,45);
		System.out.println("addition of three argument method (int,double,int):"+add1);
		double add2 =c.add(34,34,56);
		System.out.println("addition of three argument method (int,double,int):"+add2);
		
	System.out.println("-------------------------------------------------------");
		
 substraction s = new substraction();
		
		double sub1 =s.sub(34,23.89,45);
		System.out.println(" substraction of three argument method (int,double,int):"+sub1);
		double sub2 =s.sub(34,34,56);
		System.out.println(" substraction of three argument method (int,double,int):"+sub2);
		
	System.out.println("-------------------------------------------------------");
		
	Multiplication m = new Multiplication();
				
				double mul1 =m.mul(34,23.89,45);
				System.out.println("Multiplication of three argument method (int,double,int):"+mul1);
				double mul2 =m.mul(34,34,56);
				System.out.println("Multiplication of three argument method (int,double,int):"+mul2);

		
				System.out.println("-------------------------------------------------------");
				
				Division d = new Division();
				
				double div1 =d.div(34,23.89,45);
				System.out.println("Division of three argument method (int,double,int):"+div1);
				double div2 =d.div(34,34,56);
				System.out.println("Division of three argument method (int,double,int):" +div2);
				
				
	}
}
