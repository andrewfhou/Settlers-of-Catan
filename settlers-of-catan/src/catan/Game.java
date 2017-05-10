package catan;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Hex[][] board = new Hex[5][];

		board[0] = new Hex[3];
		board[1] = new Hex[4];
		board[2] = new Hex[5];
		board[3] = new Hex[4];
		board[4] = new Hex[3];

		int[] values = new int[] { 11, 12, 9, 4, 6, 5, 10, 3, 11, 4, 8, 8, 10, 9, 3, 5, 2, 6 };
		int count = 0, type;
		int[] types = new int[] { 1, 3, 4, 3, 4, 4 };

		for (int i = 0; i < board.length; i++) { // generates the board
			for (int j = 0; j < board[i].length; j++) {
				while (true) {
					type = (int) (Math.random() * 6);
					if (types[type] != 0) {
						types[type]--;
					} else {
						continue;
					}
					break;
				}
				if (type != 0) {
					board[i][j] = new Hex(type, values[count]);
					count++;
				} else {
					board[i][j] = new Hex(0, 0);
				}
			}
		}

		Scanner s = new Scanner(System.in);
		int p;
		System.out.println("Select the number of players");
		p = s.nextInt();

		Player[] players = new Player[p];

		// init settlements & roads
		for (int i = 0; i < players.length; i++) {
			System.out.println("Player "+(i+1)+", place your first settlement");
			System.out.println("Player "+(i+1)+", place your first road");
		}
		for (int i = players.length - 1; i>=0; i--) {
			System.out.println("Player "+(i+1)+", place your second settlement");
			System.out.println("Player "+(i+1)+", place your second road");

		}

		// gameplay loop
		for (Player current : players) {
			System.out.println(current.displayResources());
			System.out.println("What would you like to do?");

		}

		// prints board
		// for (Hex[] row: board)
		// {
		// for (Hex item : row)
		// {
		// System.out.print(item+" _ ");
		// }
		// System.out.println();
		// }

		s.close();
	}
}