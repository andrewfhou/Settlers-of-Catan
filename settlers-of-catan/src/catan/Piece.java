package catan;

public class Piece {
	private String name;
	private int id;
	private int player;
	// 1=s, 2=c, 3=r

	public Piece(String n, int p) {
		name = n;
		if (name.equals("Road")) {
			id = 3;
		} else if (name.equals("Settlement")) {
			id = 1;
		} else if (name.equals("City")) {
			id = 2;
		}
		player = p;
	}

	int r = 0;

	public void addRoad() {
		r++;
	}

	int s = 0;

	public void addSettlement() {
		s++;
	}

	int c = 0;

	public void addCity() {
		c++;
	}

	public String getRoads() {
		return "roads: " + r;
	}

	public String getCities() {
		return "cities: " + c;
	}

	public String getSettlements() {
		return "settlements: " + s;
	}

	public int getPoints() {
		return c * 2 + s;
	}

	public int rollDice() {
		return (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
	}
}