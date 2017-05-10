package catan;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {

	// // prints board
	// for (Hex[] row : board) {
	// for (Hex item : row) {
	// System.out.print(item + " _ ");
	// }
	// System.out.println();
	// }

	public static ArrayList<String> types = new ArrayList<String>();

	public Hex[][] generateAndGetBoard() {
		Hex[][] board = new Hex[5][];

		board[0] = new Hex[3];
		board[1] = new Hex[4];
		board[2] = new Hex[5];
		board[3] = new Hex[4];
		board[4] = new Hex[3];

		int[] values = new int[] { 11, 12, 9, 4, 6, 5, 10, 3, 11, 4, 8, 8, 10, 9, 3, 5, 2, 6 };
		int count = 0, type;
		int[] resources = new int[] { 1, 3, 4, 3, 4, 4 };

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				while (true) {
					type = (int) (Math.random() * 6);
					if (resources[type] != 0) {
						resources[type]--;
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

		return board;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// int forest = 4;
		// int grain = 4;
		// int ore = 3;
		// int wool = 4;
		// int brick = 3;
		// int desert = 1;

		Hex[][] board = generateAndGetBoard();

		for (int j = 0; j < 270; j += 90) {
			int c = (int) (Math.random() * 19) + 1;
			Polygon a = new Polygon();
			for (int i = 0; i < 6; i++) {
				a.addPoint((int) (20 + 100 + 80 + 50 * Math.cos(i * 2 * Math.PI / 6)),
						(int) (40 + 50 + 100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));
			}
			for (int k = 0; k < board[0].length; k++) {
					if (board[0][k].getType() == 5) {
						g.setColor((Color.GREEN).darker().darker());
						types.add("forest");
						System.out.println("adding forest");
					}
					if (board[0][k].getType() == 4) {
						g.setColor((Color.yellow));
						types.add("field");
						System.out.println("adding field");
					}
					if (board[0][k].getType() == 1) {
						g.setColor((Color.red).darker());
						types.add("hills");
						System.out.println("adding hills");
					}
					if (board[0][k].getType() == 3) {
						g.setColor((Color.gray).darker().darker());
						types.add("quarry");
						System.out.println("adding quarry");
					}
					if (board[0][k].getType() == 2) {
						g.setColor((Color.GREEN));
						types.add("pasture");
						System.out.println("adding pasture");
					}
					if (board[0][k].getType() == 0) {
						g.setColor((Color.black));
						types.add("desert");
						System.out.println("adding desert");
					}

					g.fillPolygon(a);
					g.drawPolygon(a);
				}
			}
		}

		// for (int j = 0; j < 360; j += 90) {
		// int c = (int) (Math.random() * 19) + 1;
		// Polygon d = new Polygon();
		// for (int i = 0; i < 6; i++)
		// d.addPoint((int) (100 + 100 + 80 + 50 * Math.cos(i * 2 * Math.PI /
		// 6)),
		// (int) (-5 + 50 + 100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));
		//
		// if (c < 5 && forest != 0) {
		// g.setColor((Color.GREEN).darker().darker());
		// forest--;
		// types.add("forest");
		// }
		// if (c < 9 && c >= 5 && grain != 0) {
		// g.setColor(Color.yellow);
		// grain--;
		// types.add("grain");
		// }
		// if (c < 13 && c >= 9 && wool != 0) {
		// g.setColor(Color.green);
		// wool--;
		// types.add("Sheep");
		// }
		// if (c < 16 && c >= 13 && brick != 0) {
		// g.setColor(Color.red.darker());
		// brick--;
		// types.add("clay");
		// }
		// if (c < 19 && c >= 16 && ore != 0) {
		// g.setColor(Color.gray);
		// ore--;
		// types.add("Quarry");
		// }
		// if (c == 19 && desert != 0) {
		// g.setColor(Color.black);
		// desert--;
		// types.add("desert");
		// }
		// g.fillPolygon(d);
		// g.drawPolygon(d);
		// }
		// for (int j = 0; j < 450; j += 90) {
		// int c = (int) (Math.random() * 19) + 1;
		// Polygon p = new Polygon();
		// for (int i = 0; i < 6; i++)
		// p.addPoint((int) (260 + 100 + 50 * Math.cos(i * 2 * Math.PI / 6)),
		// (int) (100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));
		// if (c < 5 && forest != 0) {
		// g.setColor((Color.GREEN).darker().darker());
		// forest--;
		// types.add("forest");
		// }
		// if (c < 9 && c >= 5 && grain != 0) {
		// g.setColor(Color.yellow);
		// grain--;
		// types.add("grain");
		// }
		// if (c < 13 && c >= 9 && wool != 0) {
		// g.setColor(Color.green);
		// wool--;
		// types.add("Sheep");
		// }
		// if (c < 16 && c >= 13 && brick != 0) {
		// g.setColor(Color.red.darker());
		// brick--;
		// types.add("clay");
		// }
		// if (c < 19 && c >= 16 && ore != 0) {
		// g.setColor(Color.gray);
		// ore--;
		// types.add("Quarry");
		// }
		// if (c == 19 && desert != 0) {
		// g.setColor(Color.black);
		// desert--;
		// types.add("desert");
		// }
		// g.fillPolygon(p);
		// g.drawPolygon(p);
		//
		// }
		// for (int j = 0; j < 360; j += 90) {
		// int c = (int) (Math.random() * 19) + 1;
		// Polygon s = new Polygon();
		// for (int i = 0; i < 6; i++)
		// s.addPoint((int) (160 + 100 + 100 + 80 + 50 * Math.cos(i * 2 *
		// Math.PI / 6)),
		// (int) (-5 + 50 + 100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));
		//
		// if (c < 5 && forest != 0) {
		// g.setColor((Color.GREEN).darker().darker());
		// forest--;
		// types.add("forest");
		// }
		// if (c < 9 && c >= 5 && grain != 0) {
		// g.setColor(Color.yellow);
		// grain--;
		// types.add("grain");
		// }
		// if (c < 13 && c >= 9 && wool != 0) {
		// g.setColor(Color.green);
		// wool--;
		// types.add("Sheep");
		// }
		// if (c < 16 && c >= 13 && brick != 0) {
		// g.setColor(Color.red.darker());
		// brick--;
		// types.add("clay");
		// }
		// if (c < 19 && c >= 16 && ore != 0) {
		// g.setColor(Color.gray);
		// ore--;
		// types.add("Quarry");
		// }
		// if (c == 19 && desert != 0) {
		// g.setColor(Color.black);
		// desert--;
		// types.add("desert");
		//
		// }
		// g.fillPolygon(s);
		// g.drawPolygon(s);
		// }
		// for (int j = 0; j < 270; j += 90) {
		// int c = (int) (Math.random() * 19) + 1;
		// Polygon a = new Polygon();
		// for (int i = 0; i < 6; i++)
		// a.addPoint((int) (240 + 100 + 100 + 80 + 50 * Math.cos(i * 2 *
		// Math.PI / 6)),
		// (int) (40 + 50 + 100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));
		//
		// if (c < 5 && forest != 0) {
		// g.setColor((Color.GREEN).darker().darker());
		// forest--;
		// types.add("forest");
		// }
		// if (c < 9 && c >= 5 && grain != 0) {
		// g.setColor(Color.yellow);
		// grain--;
		// types.add("grain");
		// }
		// if (c < 13 && c >= 9 && wool != 0) {
		// g.setColor(Color.green);
		// wool--;
		// types.add("Sheep");
		// }
		// if (c < 16 && c >= 13 && brick != 0) {
		// g.setColor(Color.red.darker());
		// brick--;
		// types.add("clay");
		// }
		// if (c < 19 && c >= 16 && ore != 0) {
		// g.setColor(Color.gray);
		// ore--;
		// types.add("Quarry");
		// }
		// if (c == 19 && desert != 0) {
		// g.setColor(Color.black);
		// desert--;
		// types.add("desert");
		//
		// }
		// g.fillPolygon(a);
		// g.drawPolygon(a);
		//
		// }
//	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("DrawPoly");
		frame.setSize(1500, 1500);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Container contentPane = frame.getContentPane();
		contentPane.add(new GUI());

		frame.setVisible(true);
		// frame.show();
	}
}