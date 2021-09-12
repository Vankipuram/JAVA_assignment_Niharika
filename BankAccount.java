package com.cap.io;



public class BankAccount extends Exception {
	String message;
	public BankAccount(String message) {
		this.message = message;
	}
	public static void Withdraw(int with_draw, int balance) throws BankAccount {
	
		try {
			if(with_draw>balance) {
				
				throw new BankAccount("InSufficient Funds Exception");
				
			}else {
				System.out.println("Success");
				
			}
		}catch(BankAccount e) {
			e.printStackTrace();
		}
	}

}
