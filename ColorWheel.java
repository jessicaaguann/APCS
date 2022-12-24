import java.awt.*;

public class ColorWheel {
	public static void main (String[] args) {
		DrawingPanel panel = new DrawingPanel (512, 512);
		Graphics g = panel.getGraphics ();
		for (int hue = 0; hue < 360; hue++) {
			g.setColor(Color.getHSBColor(hue * 0.0024f, 0.6f, 0.8f));
			g.fillArc(0, 0, 512, 512, hue + 1, 1);
		}
	}
}