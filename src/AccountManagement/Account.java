package AccountManagement;

public class Account {
	 private String accountNumber;
	    private String owner;
	    private int balance;

	    public static final int MIN_BALANCE = 0;
	    public static final int MAX_BALANCE = 1000000;

	    public Account(String accountNumber, String owner, int balance) {
	        this.accountNumber = accountNumber;
	        this.owner = owner;
	        setBalance(balance);
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public String getOwner() {
	        return owner;
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public void setBalance(int balance) {
	        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
	            return;
	        }
	        this.balance = balance;
	    }
	
	

}
