package catan;

import java.util.ArrayList;

public class Player {
	private int Resources[] = { 0, 0, 0, 0, 0 };
	private ArrayList <Card> developmentCards;
	private int victorypoints = 0;
	private int id = 0;
	private static int idcount=0;
	/*
	 * Brick = 0 
	 * Sheep = 1 
	 * Ore = 2 
	 * Grain = 3 
	 * Wood = 4
	 */
	
	public Player() {
		id=0;
		idcount++;
	}
	
	public int getID()
	{
		return(id);
	}
	
	public void incrementResources(int index, int amt) {
		Resources[index] += amt;
	}

	public void incrementVP(int vp) {
		victorypoints += vp;
	}

	public String displayResources() {
		return "Brick: " + Resources[0] + " Sheep: " + Resources[1] + 
				" Ore: " + Resources[2] + " Grain: " + Resources[3] + " Wood: " + Resources[4];
	}
	
	public void addCard(Card c) {
		developmentCards.add(c);
	}
	
	public void buildRoad(Hex A, Hex B, int a, int b) {
		A.buildRoad(a, id);
		B.buildRoad(b, id);
	}
	
	public void buildSettlement(Hex A, Hex B, Hex C, int a, int b, int c) {
		if(!(A.hasSettlement(a) && B.hasSettlement(b) && C.hasSettlement(c))) {
			A.buildSettlement(a, 1, id);
			B.buildSettlement(b, 1, id);
			C.buildSettlement(c, 1, id);
		}

	}
	
	public void buildCity(Hex A, Hex B, Hex C, int a, int b, int c) {
		if(!(A.hasSettlement(a) && B.hasSettlement(b) && C.hasSettlement(c))) {
			A.buildSettlement(a, 2, id);
			B.buildSettlement(b, 2, id);
			C.buildSettlement(c, 2, id);
		}
	}
	
}
