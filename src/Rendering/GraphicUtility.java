package Rendering;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;

import Tetris.Vector2;

public class GraphicUtility {
	static final int TOOLBAR_OFFSET = 22;
	static final Vector2 SHADOW_OFFSET = new Vector2(2, 2);
	
	public static void draw_string_with_shadow(Graphics graphics, String str, int x, int y, Color shadow_color) {
		Color old_color = graphics.getColor();

		graphics.setColor(shadow_color);
		draw_centered_string(graphics, str, x - SHADOW_OFFSET.x, y - SHADOW_OFFSET.y);
			
		graphics.setColor(old_color);
		draw_centered_string(graphics, str, x, y);
	}
	
	public static void draw_centered_string(Graphics graphics, String str, int x, int y) {
		FontMetrics metrics = graphics.getFontMetrics();
		
		graphics.drawString(str, x - metrics.stringWidth(str)/2, y - metrics.getHeight() + TOOLBAR_OFFSET);
	}
}
