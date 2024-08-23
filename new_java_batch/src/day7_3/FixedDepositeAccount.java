package day7_3;

class FixedDepositeAccount extends Account {
    private double amount;
    private float duration;

    public FixedDepositeAccount(int accNo, String name, double amount, float duration) {
        super(accNo, name);
        this.amount = amount;
        this.duration = duration;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Fixed Deposit Amount: " + amount);
        System.out.println("Duration (years): " + duration);
    }
}

