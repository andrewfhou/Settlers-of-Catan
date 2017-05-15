package catan;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {

	ArrayList<String> hexValue = new ArrayList<String>(Arrays.asList("5", "2", "6", "9", "4", "5", "3", "10", "4", "6",
			"8", "8", "11", "3", "9", "11", "10", "12"));
	int e = 0;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<String> x = new ArrayList<String>();
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
				x.add("forest");
				e++;
				g.setColor((Color.GREEN).darker().darker());

			} else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				x.add("grain");
				e++;
				g.setColor(Color.yellow);

			} else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				x.add("Sheep");
				e++;
				g.setColor(Color.green);
			} else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				x.add("clay");
				e++;
				g.setColor(Color.red.darker());
			} else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				x.add("Quarry");
				e++;
				g.setColor(Color.gray);
			} else if (c == 19 && desert != 0) {
				desert--;
				x.add("desert");
				hexValue.add(e-1, "0");
				g.setColor(Color.black);
			} else
				j -= 90;

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
				x.add("forest");
				e++;
				g.setColor((Color.GREEN).darker().darker());

			} else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				x.add("grain");
				e++;
				g.setColor(Color.yellow);

			} else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				x.add("Sheep");
				e++;
				g.setColor(Color.green);
			} else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				x.add("clay");
				e++;
				g.setColor(Color.red.darker());
			} else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				x.add("Quarry");
				e++;
				g.setColor(Color.gray);
			} else if (c == 19 && desert != 0) {
				desert--;
				x.add("desert");
				hexValue.add(e-1, "0");
				g.setColor(Color.black);
			} else
				j -= 90;
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
				x.add("forest");
				e++;
				g.setColor((Color.GREEN).darker().darker());

			} else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				x.add("grain");
				e++;
				g.setColor(Color.yellow);

			} else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				x.add("Sheep");
				e++;
				g.setColor(Color.green);
			} else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				x.add("clay");
				e++;
				g.setColor(Color.red.darker());
			} else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				x.add("Quarry");
				e++;
				g.setColor(Color.gray);
			} else if (c == 19 && desert != 0) {
				desert--;
				x.add("desert");
				hexValue.add(e-1, "0");
				g.setColor(Color.black);
			} else
				j -= 90;
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
				x.add("forest");
				e++;
				g.setColor((Color.GREEN).darker().darker());

			} else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				x.add("grain");
				e++;
				g.setColor(Color.yellow);

			} else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				x.add("Sheep");
				e++;
				g.setColor(Color.green);
			} else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				x.add("clay");
				e++;
				g.setColor(Color.red.darker());
			} else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				x.add("Quarry");
				e++;
				g.setColor(Color.gray);
			} else if (c == 19 && desert != 0) {
				desert--;
				x.add("desert");
				hexValue.add(e-1, "0");
				g.setColor(Color.black);
			} else
				j -= 90;
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
				x.add("forest");
				e++;
				g.setColor((Color.GREEN).darker().darker());

			} else if (c < 9 && c >= 5 && grain > 0) {
				grain--;
				x.add("grain");
				e++;
				g.setColor(Color.yellow);

			} else if (c < 13 && c >= 9 && wool > 0) {
				wool--;
				x.add("Sheep");
				e++;
				g.setColor(Color.green);
			} else if (c < 16 && c >= 13 && brick > 0) {
				brick--;
				x.add("clay");
				e++;
				g.setColor(Color.red.darker());
			} else if (c < 19 && c >= 16 && ore > 0) {
				ore--;
				x.add("Quarry");
				e++;
				g.setColor(Color.gray);
			} else if (c == 19 && desert != 0) {
				desert--;
				x.add("desert");
				hexValue.add(e-1, "0");
				g.setColor(Color.black);
			} else
				j -= 90;
			g.fillPolygon(a);
			g.drawPolygon(a);
			g.setColor(Color.black);
			Font font = new Font("Times New Roman", 1, 20);
			g.setFont(font);
			int o = 0;
			g.drawString(hexValue.get(o), 191, 200);
			o++;
			g.drawString(hexValue.get(o), 191, 288);
			o++;
			g.drawString(hexValue.get(o), 191, 378);
			o++;
			// first column^^
			g.drawString(hexValue.get(o), 275, 150);
			o++;
			g.drawString(hexValue.get(o), 275, 240);
			o++;
			g.drawString(hexValue.get(o), 275, 330);
			o++;
			g.drawString(hexValue.get(o), 275, 420);
			o++;
			//second column^^
			g.drawString(hexValue.get(o), 351, 108);
			o++;
			g.drawString(hexValue.get(o), 351, 198);
			o++;
			g.drawString(hexValue.get(o), 351, 288);
			o++;
			g.drawString(hexValue.get(o), 351, 378);
			o++;
			g.drawString(hexValue.get(o), 351, 468);
			o++;
			// middle column^^
			g.drawString(hexValue.get(o), 430, 150);
			o++;
			g.drawString(hexValue.get(o), 430, 240);
			o++;
			g.drawString(hexValue.get(o), 430, 330);
			o++;
			g.drawString(hexValue.get(o), 430, 420);
			o++;
			//fourth column^^	
			g.drawString(hexValue.get(o), 511, 200);
			o++;
			g.drawString(hexValue.get(o), 511, 288);
			o++;
			g.drawString(hexValue.get(o), 511, 378);
			
			// last column
			

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