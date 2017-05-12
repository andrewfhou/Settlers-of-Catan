package catan;

import java.awt.Color;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {

	/*Hex[][] board = new Hex[5][];
	{

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

		// prints board
		// for (Hex[] row: board)
		// {
		// for (Hex item : row)
		// {
		// System.out.print(item+" _ ");
		// }
		// System.out.println();
		// }
	}*/

	int board1[]=new int[3];
	int board2[]=new int[4];
	int board3[]=new int[5];
	int board4[]=new int[4];
	int board5[]=new int[4];
	public static ArrayList<String> types = new ArrayList<String>();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int forest = 4;
		int grain = 4;
		int ore = 3;
		int wool = 4;
		int brick = 3;
		int desert = 1;

		for (int j = 0; j < 270; j += 90) {
			int c = (int) (Math.random() * 6) + 1;
			Polygon a = new Polygon();
			for (int i = 0; i < 6; i++)
				a.addPoint((int) (20 + 100 + 80 + 50 * Math.cos(i * 2 * Math.PI / 6)),
						(int) (40 + 50 + 100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));

				if (c < 5 && forest > 0) {
					forest--;
					types.add("forest");
					g.setColor((Color.GREEN).darker().darker());
				
				}
				else if (c < 9 && c >= 5 && grain > 0) {
					grain--;
					g.setColor(Color.yellow);
					types.add("grain");
				}
				else if (c < 13 && c >= 9 && wool > 0) {
					wool--;
					g.setColor(Color.green);
					types.add("Sheep");
				}
				else if (c < 16 && c >= 13 && brick > 0) {
					brick--;
					g.setColor(Color.red.darker());
					types.add("clay");
				}
				else if (c < 19 && c >= 16 && ore > 0) {
					ore--;
					g.setColor(Color.gray);
					types.add("Quarry");
				}
				else if (c == 19 && desert != 0) {
					desert--;
					g.setColor(Color.black);
					types.add("desert");
				}
				else
					j-=90;
					

				g.fillPolygon(a);
				g.drawPolygon(a);
				
			
		}

		for (int j = 0; j < 360; j += 90) {
			int c = (int) (Math.random() * 19) + 1;
			Polygon d = new Polygon();
			for (int i = 0; i < 6; i++)
				d.addPoint((int) (100 + 100 + 80 + 50 * Math.cos(i * 2 * Math.PI / 6)),
						(int) (-5 + 50 + 100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));

			if (c < 5 && forest > 0) {
				forest--;
				types.add("forest");
				g.setColor((Color.GREEN).darker().darker());
			
			}
			else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				g.setColor(Color.yellow);
				types.add("grain");
			}
			else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				g.setColor(Color.green);
				types.add("Sheep");
			}
			else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				g.setColor(Color.red.darker());
				types.add("clay");
			}
			else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				g.setColor(Color.gray);
				types.add("Quarry");
			}
			else if (c == 19 && desert != 0) {
				desert--;
				g.setColor(Color.black);
				types.add("desert");
			}
			else
				j-=90;
			g.fillPolygon(d);
			g.drawPolygon(d);
			
			

			
		}
		for (int j = 0; j < 450; j += 90) {
			int c = (int) (Math.random() * 19) + 1;
			Polygon p = new Polygon();
			for (int i = 0; i < 6; i++)
				p.addPoint((int) (260 + 100 + 50 * Math.cos(i * 2 * Math.PI / 6)),
						(int) (100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));

			if (c < 5 && forest > 0) {
				forest--;
				types.add("forest");
				g.setColor((Color.GREEN).darker().darker());
			
			}
			else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				g.setColor(Color.yellow);
				types.add("grain");
			}
			else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				g.setColor(Color.green);
				types.add("Sheep");
			}
			else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				g.setColor(Color.red.darker());
				types.add("clay");
			}
			else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				g.setColor(Color.gray);
				types.add("Quarry");
			}
			else if (c == 19 && desert != 0) {
				desert--;
				g.setColor(Color.black);
				types.add("desert");
			}
			else
				j-=90;
			g.fillPolygon(p);
			g.drawPolygon(p);

		}
		for (int j = 0; j < 360; j += 90) {
			int c = (int) (Math.random() * 19) + 1;
			Polygon s = new Polygon();
			for (int i = 0; i < 6; i++)
				s.addPoint((int) (160 + 100 + 100 + 80 + 50 * Math.cos(i * 2 * Math.PI / 6)),
						(int) (-5 + 50 + 100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));


			if (c < 5 && forest > 0) {
				forest--;
				types.add("forest");
				g.setColor((Color.GREEN).darker().darker());
			
			}
			else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				g.setColor(Color.yellow);
				types.add("grain");
			}
			else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				g.setColor(Color.green);
				types.add("Sheep");
			}
			else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				g.setColor(Color.red.darker());
				types.add("clay");
			}
			else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				g.setColor(Color.gray);
				types.add("Quarry");
			}
			else if (c == 19 && desert != 0) {
				desert--;
				g.setColor(Color.black);
				types.add("desert");
			}
			else
				j-=90;
			g.fillPolygon(s);
			g.drawPolygon(s);
		}
		for (int j = 0; j < 270; j += 90) {
			int c = (int) (Math.random() * 19) + 1;
			Polygon a = new Polygon();
			for (int i = 0; i < 6; i++)
				a.addPoint((int) (240 + 100 + 100 + 80 + 50 * Math.cos(i * 2 * Math.PI / 6)),
						(int) (40 + 50 + 100 + j + 50 * Math.sin(i * 2 * Math.PI / 6)));


			if (c < 5 && forest > 0) {
				forest--;
				types.add("forest");
				g.setColor((Color.GREEN).darker().darker());
			
			}
			else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				g.setColor(Color.yellow);
				types.add("grain");
			}
			else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				g.setColor(Color.green);
				types.add("Sheep");
			}
			else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				g.setColor(Color.red.darker());
				types.add("clay");
			}
			else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				g.setColor(Color.gray);
				types.add("Quarry");
			}
			else if (c == 19 && desert != 0) {
				desert--;
				g.setColor(Color.black);
				types.add("desert");
			}
			else
				j-=90;
			g.fillPolygon(a);
			g.drawPolygon(a);
			g.setColor(Color.black);
			g.drawString("12", 353, 105);
			g.drawString("2", 355, 195);

		}
	}

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

		frame.show();
	}
	
}