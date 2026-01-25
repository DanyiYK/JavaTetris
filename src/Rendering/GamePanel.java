package Rendering;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	final static Font gameFont = new Font("Arial", Font.PLAIN, 12);

	public long timeSinceLastFrame = 1;
	
	public GamePanel() {
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
		System.out.println("Updated!");
		super.paintComponent(graphics);
		
		// Clear background
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, 480, 720);
		
		// TODO: Draw grid
		
		// TODO: Draw moving block
		
		// Draw FPS and update time
		graphics.setColor(Color.BLACK);
		graphics.setFont(gameFont);
		graphics.drawString(getFPSLabelText(), 425, 22);
		
		timeSinceLastFrame = System.currentTimeMillis();
	}
}
