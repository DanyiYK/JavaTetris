package Rendering;

import java.awt.FontMetrics;
import java.awt.Graphics;

public class GraphicUtility {
	static final int TOOLBAR_OFFSET = 22;
	
	public static void draw_centered_string(Graphics graphics, String str, int x, int y) {
		FontMetrics metrics = graphics.getFontMetrics();
		
		graphics.drawString(str, x - metrics.stringWidth(str)/2, y - metrics.getHeight() + TOOLBAR_OFFSET);
	}
}
