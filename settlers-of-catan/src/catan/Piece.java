package catan;

public class Piece {
	private Piece settlement;
	private Piece city;
	private Piece road;

	public Piece(Piece s, Piece c, Piece r) {
		settlement = s;
		city = c;
		road = r;
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

	public int rollDice()
	{
		return (int)(Math.random()*6)+1+(int)(Math.random()*6)+1;
	}
}