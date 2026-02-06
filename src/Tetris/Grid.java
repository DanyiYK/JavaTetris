package Tetris;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Grid will contain a number from 0 (empty) to 8 (7 colored pieces)
 */

public class Grid {
	public int[][] grid;
	
	public Vector2 position;
	public Vector2 size;
	public int pixel_size;
	
	private static final Color[] VALUES_TO_COLOR = {
			Color.WHITE,
			Color.RED,
			Color.GREEN,
			Color.CYAN,
			Color.MAGENTA,
			Color.BLUE,
			Color.ORANGE,
			Color.PINK,
			Color.YELLOW,
	};
	
	public Grid(Vector2 grid_position, Vector2 grid_size, int pixel_size) {
		
		this.position = grid_position;
		this.size = grid_size;
		this.pixel_size = pixel_size;
		
		this.grid = new int[size.y][size.x];
		
		for(int i = 0; i < size.y; i++) {
			for(int j = 0; j < size.x; j++) {
				this.grid[i][j] = Math.toIntExact(Math.round(Math.random()*8));
			}
		}
	}
	
	/**
	 * Takes an Y coordinate and use it to shift all the pixels above by one pixel
	 */
	public void removeAndCollapseLine(int collapseFromY) {
		
	}
	
	/**
	 * Remove lines that are >0
	 */
	public void removeLines() {
		
	}
	
	/**
	 * Safely changes a pixel
	 */
	public void setPixel() {
		
	}
	
	/**
	 * This function will take a Block matrix and will place it on the grid
	 */
	public void placeBlock(int[][] blockData, int x, int y) {
		
	}
	
	/**
	 * Draws the grid on the canvas
	 * TODO: Add an offset
	*/
	
	/** TODO: Move this in MainGame please :3
	public void draw(Graphics graphics) {
		int pixelValue;
		
		// Draw grid pixels
		for(int y = 0; y < gridSizeY; y++) {
			for(int x = 0; x < gridSizeX; x++) {
				pixelValue = grid[y][x];
				
				graphics.setColor(pixelValuetoColor(pixelValue));
				graphics.fillRect(startGridPositionX+x*pixelSize, startGridPositionY+y*pixelSize, pixelSize, pixelSize);
			}
		}
		
		// Outline
		graphics.setColor(Color.BLACK);
		
		for(int y = 0; y < gridSizeY; y++) {
			graphics.drawRect(startGridPositionX, startGridPositionY+y*pixelSize, gridSizeX*pixelSize, pixelSize);
		}
		
		for(int x = 0; x < gridSizeX; x++) {
			graphics.drawRect(startGridPositionX+x*pixelSize, startGridPositionY, pixelSize, gridSizeY*pixelSize);
		}
	}
	*/
	
	public Color pixel_value_to_color(int value) {
		if(value < 0 || value >= VALUES_TO_COLOR.length) {
			return Color.BLACK;
		}
		
		return VALUES_TO_COLOR[value];
	}
}
