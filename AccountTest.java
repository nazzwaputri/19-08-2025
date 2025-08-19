public class AccountTest {
    public static void main(String[] args) {
       SavingsAccount account1 = new SavingsAccount();
        account1.name = "123456789";
        account1.balance = 1000.0;
        account1.interestRate = 0.05;
        account1.displayCustomer();

        SavingsAccount account2 = new SavingsAccount();
        account2.name = "987654321";
        account2.balance = 9000.;
        account2.interestRate = 0.03;
        account2.displayCustomer();

        SavingsAccount account3 = new SavingsAccount();
        account3.name = "456789123";
        account3.balance = 5000.0;
        account3.interestRate = 0.04;
        account3.displayCustomer();
        
    }
    
}
