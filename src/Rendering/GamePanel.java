package Rendering;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import Tetris.GameData;
import Tetris.Grid;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	final static Font gameFont = new Font("Arial", Font.PLAIN, 12);

	public long timeSinceLastFrame = 1;
	public GameData gameData;
	public Grid grid;
	
	public GamePanel(GameData data) {
		this.gameData = data;
		this.grid = data.gameGrid;
		
		setBackground(Color.WHITE);
	}
	
	/**
	 * Returns the amount of FPS the game is running.
	 * Format is "%d FPS"
	 * @return
	 */
	public String getFPSLabelText() {
		long systemTime = System.currentTimeMillis();
		long difference = (systemTime - timeSinceLastFrame);
		
		return (difference==0 ? "Inf" : 1000/difference) + " FPS";
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(480, 720);
	}
	
	public void paintComponent(Graphics graphics) {
		// System.out.println("Updated!");
		super.paintComponent(graphics);
		
		// Clear background
		graphics.setColor(Color.DARK_GRAY);
		graphics.fillRect(0, 0, 480, 720);
		
		grid.draw(graphics);
		
		// TODO: Draw moving block
		
		// Draw game stats like fps, score, and next block (this last one is TODO)
		graphics.setColor(Color.WHITE);
		
		graphics.setFont(gameFont);
		
		graphics.drawString(getFPSLabelText(), 400, 22);
		graphics.drawString(gameData.score + " Points", 400, 40);
		
		timeSinceLastFrame = System.currentTimeMillis();
	}
}
