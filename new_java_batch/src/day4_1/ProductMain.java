package day4_1;

public class ProductMain {

	public static void main(String[] args) {
		Product [] arr = new Product [3];
		
		Product P  =new Product(567,"soap",35);
		
		arr[0]=P;
		arr[1]=new Product(45,"sugar",56);
		arr[2]=new Product(47,"sur",6);
		
		 for (Product p1:arr) {
			 System.out.println(p1);
			 System.out.println("==============================================");
		 }
		
		
	}
} 
