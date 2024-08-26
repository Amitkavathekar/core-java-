package day11_2interface_PRINTABLE;

public interface printable {
    int a = 0;

    void print();
    
    static void demoprint() {
        System.out.println("demoprint method from interface");
    }

    default void print11() {
        System.out.println("default method from the interface");
    }
    
    
}
