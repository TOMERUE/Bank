
public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();

        account.setName("Bayu");
        account.setBalance(100000);
        account.deposit(50000);
        account.displayAccount();
        account.withdraw(50000);
    }
}
