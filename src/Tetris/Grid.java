package Tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Grid will contain a number from 0 (empty) to 8 (7 colored pieces)
 */

public class Grid {
	public int[][] grid;
	static int pixelSize = 30;
	public int gridSizeX = 10;
	public int gridSizeY = 20;
	
	public Grid() {
		this.grid = new int[gridSizeY][gridSizeX];
		
		for(int i = 0; i < gridSizeY; i++) {
			for(int j = 0; j < gridSizeX; j++) {
				this.grid[i][j] = Math.toIntExact(Math.round(Math.random()*8));
			}
		}
		
		System.out.println("" + this.grid[0][0]);
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
	*/
	public void draw(Graphics graphics) {
		int value;
		
		// Blocks
		for(int y = 0; y < gridSizeY; y++) {
			for(int x = 0; x < gridSizeX; x++) {
				value = grid[y][x];
				
				graphics.setColor(pixelValuetoColor(value));
				graphics.fillRect(x*pixelSize, y*pixelSize, pixelSize, pixelSize);
			}
		}
		
		// Outline
		graphics.setColor(Color.WHITE);
		
		for(int y = 0; y < gridSizeY; y++) {
			graphics.drawRect(0, y*pixelSize, gridSizeX*pixelSize, pixelSize);
		}
		
		for(int x = 0; x < gridSizeX; x++) {
			graphics.drawRect(x*pixelSize, 0, pixelSize, gridSizeY*pixelSize);
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
