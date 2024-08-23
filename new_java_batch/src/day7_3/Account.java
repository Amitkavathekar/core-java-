package day7_3;

public class Account {

    private int accNo;
    private String name;

    public Account(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
    }

    public void print() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder Name: " + name);
    }
}

