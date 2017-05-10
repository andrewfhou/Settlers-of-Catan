package catan;

import java.util.ArrayList;

public class Player {
	private int Resources[] = { 0, 0, 0, 0, 0 };
	private ArrayList <Card> developmentCards;
	private int victorypoints = 0;

	/*
	 * Brick = 0 
	 * Sheep = 1 
	 * Ore = 2 
	 * Grain = 3 
	 * Wood = 4
	 */
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
}
