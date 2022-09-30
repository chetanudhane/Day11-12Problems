package day11and12problems;

import java.util.Scanner;

public class AccountTest {

	static int account_Balance = 0;
	Scanner scanner = new Scanner(System.in);

	static void credit(double amount) {
		account_Balance += amount;
		System.out.println(amount + " credited and total available balance is " + account_Balance);
	}

	static void debit(double amount) {
		if (amount < account_Balance) {
			account_Balance -= amount;
			System.out.println(amount + " debited and remaining banalce is " + account_Balance);
		} else {
			System.out.println("Insufficient amount, Kindly credit the amount");
		}
	}

	public static int getAccount_Balance() {
		return account_Balance;
	}

	public static void setAccount_Balance(int account_Balance) {
		AccountTest.account_Balance = account_Balance;
	}
}
