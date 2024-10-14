package threads3;

public class UserThread extends Thread{
	private BankAccount1 bankAccount;
    private String operationType;
    private int amount;

    public UserThread(BankAccount1 bankAccount, String operationType, int amount) {
        this.bankAccount = bankAccount;
        this.operationType = operationType;
        this.amount = amount;
    }

    public void run() {
        if (operationType.equals("deposit")) {
            bankAccount.deposit(amount);
        } else if (operationType.equals("withdraw")) {
            bankAccount.withdraw(amount);
        }
    }

}
