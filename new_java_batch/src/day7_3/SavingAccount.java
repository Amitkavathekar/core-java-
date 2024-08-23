package day7_3;

class SavingAccount extends Account {
    private double balance;

    public SavingAccount(int accNo, String name, double balance) {
        super(accNo, name);
        this.balance = balance;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Balance is : " + balance);
    }
}
