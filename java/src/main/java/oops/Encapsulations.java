package oops;

public class Encapsulations {
	public static void main(String[] args) {
		Account account_holder = new Account();
		account_holder.deposit(100);
		/*
		account_holder.account_balance = -100; // hacker changed the balance to -100
		account_holder.deposit(100);
		*/
		account_holder.get_balance();
	

	}

}

class Account{
	private int account_number;
	private int account_balance; // The field Account.account_balance is not visible
	
	public void deposit(int amount) { // setter method: it is updating/ setting the account_balance
		if (amount < 0) {
			System.out.println("Enter valid amount");
		} else {
			account_balance = account_balance + amount;
			System.out.println("Current balance is " + account_balance);
		}
		
	}
	
	public void get_balance() { // Getter method to get the data of private variable
		System.out.println("Current balance is " + account_balance);
	}
	
}


