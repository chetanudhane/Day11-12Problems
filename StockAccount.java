package day11and12problems;

public interface StockAccount {

	double valueOf();

	void buy(int amount, String symbol);

	void sell(int amount, String symbol);

	void printReport();
}
