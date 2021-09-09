
class Savings_Account{
	private String name;
	private int accNumber;
	private int accountBalance;
	Savings_Account(){
		name=null;
		accNumber=000000;
		accountBalance=0;
	}
	public Savings_Account(int accountBalance) {
		//this.name=name;
	//	this.accNumber=accNumber;
		this.accountBalance=accountBalance;
		
	}
	int getFixedDeposit() {
		return accountBalance;
	}
	
}
class Current_Account{
	private String name1;
	private int accnumber;
	private int balance;
	Current_Account(){
		name1=null;
		accnumber=0;
		balance=0;
	}
	public Current_Account(int balance) {
		this.balance=balance;
	}
	int getCashCredit() {
		return balance;
	}
}



public class Assignment2_3 {
	public static void main(String[] args) {
		Savings_Account m1 = new Savings_Account(10000000);
		Current_Account m2 = new Current_Account(45678000);
		int m = m1.getFixedDeposit() + m2.getCashCredit();
		System.out.println(m);
	}

}
