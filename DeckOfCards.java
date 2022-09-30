package day11and12problems;

public class DeckOfCards {

	static final int numOfPlayers = 4;
	static final int numOfDistCards = 9;

	public static void main(String[] args) {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		shuffle(suits, ranks);
	}

	public static void shuffle(String[] suits, String[] ranks) {
		int[][] array = new int[suits.length][ranks.length];
		int n = suits.length * ranks.length;
		String[] deck = new String[n];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
			}
		}

		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < numOfPlayers; i++) {
			array[i][0] = i + 1;
			System.out.println("Person  " + array[i][0]);
			for (int j = 0; j < numOfDistCards; j++) {
				System.out.println(deck[i + j * numOfPlayers] + "\n");
			}
		}
	}
}
