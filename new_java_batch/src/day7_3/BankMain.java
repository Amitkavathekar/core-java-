package day7_3;

public class BankMain {
    public static void main(String[] args) {
        SavingAccount savingAcc = new SavingAccount(101, "sultan", 1500.00);
        
        FixedDepositeAccount fixedDepositeAcc = new FixedDepositeAccount(102, "aniket", 10000.00, 5.5f);

        System.out.println("Saving Account Details:");
        savingAcc.print();

        System.out.println("\nFixed Deposit Account Details:");
        fixedDepositeAcc.print();
    }
}
