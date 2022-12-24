import java.util.*;
import java.awt.*;
import java.io.*;

public class SavitskyGolay {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("KeelingDataSavGol.txt");
		Scanner input = new Scanner(f);
		DrawingPanel panel = new DrawingPanel (800, 400);
		Graphics g = panel.getGraphics();
		Font currentFont = g.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 0.75F);
		g.setFont(newFont);
		int count = 0;
		for (int i = 0; i <= 696; i++) {
			g.drawOval(i, (int) (Math.rint(400 - (input.nextDouble() - 310) * 4)), 1, 1);
			if ((i % 24 == 0) && i >= 24) {
        		g.drawLine(i, 380, i, 385);
        		int c = 1960 + count * 2;
        		g.drawString(Integer.toString(c), i - 12, 395);
        		count++;
        	}
		}
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer for the width of the window of time: ");
		int windowWidth = console.nextInt();
		ArrayList<Double> list = new ArrayList<Double>();
        ArrayList<Double> sums = new ArrayList<Double>();
        File temp = new File("KeelingDataSavGol.txt");
		Scanner result = new Scanner(temp);
		while (result.hasNextDouble()) {
			list.add(result.nextDouble());
		}
		for (int i = windowWidth / 2; i < 697 - windowWidth / 2; i++) {
			double y = 0;
			int index = windowWidth / 2 * -1;
			while (index < windowWidth / 2) {
				y+= list.get(i + index);
				index++;
			}
			y /= windowWidth;
			sums.add(y);
			g.drawOval(i, (int) (Math.rint(400 - (y - 310) * 4)), 1, 1);
		}
		System.out.print("Enter an integer 0 - 11 corresponding to desired filter: ");
		int filterKey = console.nextInt();
        System.out.println();
        int[][] array = {
        		{  0,    0,   -3,   12,  17,  12,  -3,   0,   0}, 
        		{  0,   -2,    3,    6,   7,   6,   3,  -2,   0},
        		{-21,   14,   39,   54,  59,  54,  39,  14, -21},
        		{  0,    5,  -30,   75, 131,  75, -30,   5,   0},
        		{ 15,  -55,   30,  135, 179, 135,  30, -55,  15},
        		{  0,    0,    0,   -1,   0,   1,   0,   0,   0},
        		{  0,    0,   -2,   -1,   0,   1,   2,   0,   0},
        		{  0,   -3,   -2,   -1,   0,   1,   2,   3,   0},
        		{ -4,   -3,   -2,   -1,   0,   1,   2,   3,   4},
        		{  0,    0,    1,   -8,   0,   8,  -1,   0,   0},
        		{  0,   22,  -67,  -58,   0,  58,  67, -22,   0},
        		{ 86, -142, -193, -126,   0, 126, 193, 142, -86}
        };
        for (int i = 4; i < 669; i++) {
        	double sum = (array[filterKey][0] * sums.get(i - 4)) + (array[filterKey][1] * sums.get(i - 3)) + (array[filterKey][2] * sums.get(i - 2)) + (array[filterKey][3] * sums.get(i - 1)) + (array[filterKey][4] * sums.get(i)) + (array[filterKey][5] * sums.get(i + 1)) + (array[filterKey][6] * sums.get(i + 2)) + (array[filterKey][7] * sums.get(i + 3)) + (array[filterKey][8] * sums.get(i + 4));
        	g.drawOval(i, (int) (400 - Math.rint(16 * sum)), 1, 1);
        }
		input.close();
		result.close();
		console.close();
	}
}
