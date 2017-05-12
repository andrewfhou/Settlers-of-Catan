
package catan;

public class Hex {
	private Piece[] sides = new Piece[6];
	private Piece[] corners = new Piece[6];
	private int[] resourceAllocation;
	private int type;
	private int value;
	private int id;
	private static int number = 0;

	/*
	 * Desert = 0 Hills = 1 Pasture = 2 Mountains = 3 Fields = 4 Forest = 5
	 */

	public void buildRoad(int side, int pid) {
		sides[side] = new Piece("Road", pid);
	}

	public void buildSettlement(int corner, int type, int pid) {
		if (type == 1) {
			corners[corner] = new Piece("Settlement", pid);
		} else if (type == 2) {
			corners[corner] = new Piece("City", pid);
		}

		incrementResourceArray(pid);
	}

	public void incrementResourceArray(int p) {
		resourceAllocation[p]++;
	}

	public boolean hasSettlement(int corner) {
		if (corners[corner] != null) {
			return false;
		}
		return true;
	}

	public void initPlayerNum(int n) {
		resourceAllocation = new int[n];
	}

	public int[] allocateResources() {
		return resourceAllocation;
	}

	public Hex(int t, int v) {
		type = t;
		value = v;
		number++;
		id = number;
	}

	public int getValue() {
		return (value);
	}

	public int getType() {
		return (type);
	}

	public void setValue(int v) {
		value = v;
	}

	public void setType(int t) {
		type = t;
	}

	public String toString() {
		return "Type: " + type + " Value: " + value;
	}

}