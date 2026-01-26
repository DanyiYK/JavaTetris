package Tetris;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Grid will contain a number from 0 (empty) to 8 (7 colored pieces)
 */

public class Grid {
	public int[][] grid;
	
	int startGridPositionX, startGridPositionY, gridSizeX, gridSizeY, pixelSize;
	
	public Grid(GameData data) {
		this.startGridPositionX = data.startGridPositionX;
		this.startGridPositionY = data.startGridPositionY;
		this.gridSizeX = data.gridSizeX;
		this.gridSizeY = data.gridSizeY;
		this.pixelSize = data.pixelSize;
		
		this.grid = new int[gridSizeY][gridSizeX];
		
		for(int i = 0; i < gridSizeY; i++) {
			for(int j = 0; j < gridSizeX; j++) {
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
	
	/*
	 * I don't know if there's a better way to do this, if so, I'd like to be corrected.
	 * As for now, I think this is good i guess.
	 */
	public Color pixelValuetoColor(int value) {
		return switch(value) {
			case 0 -> Color.WHITE;
			case 1 -> Color.RED;
			case 2 -> Color.GREEN;
			case 3 -> Color.CYAN;
			case 4 -> Color.MAGENTA;
			case 5 -> Color.BLUE;
			case 6 -> Color.ORANGE;
			case 7 -> Color.PINK;
			case 8 -> Color.YELLOW;
			default -> Color.WHITE;
		};
	}
}
