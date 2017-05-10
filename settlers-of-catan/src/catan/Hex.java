
package catan;

public class Hex {
	private Piece[] sides;
	private Piece[] corners;
	private int type;
	private int value;
	private int id;
	private static int number=0;

	/*
	 * Desert = 0 
	 * Hills = 1 
	 * Pasture = 2 
	 * Mountains = 3 
	 * Fields = 4 
	 * Forest = 5
	 */

	public Hex(int t, int v) {
		type = t;
		value = v;
		number++;
		id=number;
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
		return "Type: "+type+" Value: "+value;
	}

}