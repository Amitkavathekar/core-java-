package day11_5interfacE_lambdaexpression;

	public interface addble {
	    int add(int a, int b);

	  //  void print();
	    
	    static void demoprint() {
	        System.out.println("demoprint method from interface");
	    }

	    default void print11() {
	        System.out.println("default method from the interface");
	    }
	}
