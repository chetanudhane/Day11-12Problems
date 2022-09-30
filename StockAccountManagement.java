package day11and12problems;

import java.util.Scanner;

public class StockAccountManagement {

	public static void main(String[] args) {

		System.out.println("Stock Account Management Program ! \n");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		StockManagement stockManagement = new StockManagement();
		boolean isExit = true;
		do {
			System.out.println("Select the option from below : " + "\n1.Add Stock" + "\n2.print stock report"
					+ "\n3.Exit program");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				stockManagement.addStock();
				break;

			case 2:
				stockManagement.printStock();
				break;
			case 3:
				isExit = false;
				System.out.println("Exit");
				break;
			default:
				System.out.println("Kindly Enter a valid option .....");
			}
		} while (isExit);
	}
}
