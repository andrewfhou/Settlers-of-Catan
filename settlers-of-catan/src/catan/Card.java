package catan;

import java.util.ArrayList;

public class Card {
	private final String KNIGHT = "Knight";
	private final String VP = "victory point";
	private final String RDBLD = "Road Building";
	private final String MONOPOLY = "Monopoly";
	private final String YRPLNTY = "Year of Plenty";

	public Card() {

	}

	public void shuffle() {
		ArrayList<String> x = new ArrayList<String>();
		int s = 5;
		int a = 2;
		int f = 2;
		int d = 2;
		for (int i = 0; i < 25; i++) {
			int y = (int) (Math.random() * 25) + 1;

			if (y < 20 && y >= 15 && s != 0) {
				x.add(VP);
				s--;
			} else if (y < 22 && y >= 20 && a != 0) {
				x.add(RDBLD);
				a--;
			} else if (y < 24 && y >= 22 && f != 0) {
				x.add(MONOPOLY);
				f--;
			} else if (y < 26 && y >= 24 && d != 0) {
				x.add(YRPLNTY);
				d--;
			} else
				x.add(KNIGHT);
		}
	}
}