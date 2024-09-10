package InterfaceExamplePerson;

public interface Bank {
	
	double maxBalance = 100000;
	double maxWithdraw = 20000;
	
	void deposite(SavingAccount account, double amount);
	void withdraw(SavingAccount account, double amount);


}
