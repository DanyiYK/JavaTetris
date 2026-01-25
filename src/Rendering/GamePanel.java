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
	public int updates = 0;
	
	public GamePanel() {
		setBackground(Color.WHITE);
	}
	
	public String getFPSLabelText() {
		long systemTime = System.currentTimeMillis();
		long difference = (systemTime - timeSinceLastFrame);
		System.out.println(timeSinceLastFrame + " " + systemTime);
		return difference==0 ? "Inf" : 1000/difference + " FPS";
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(480, 720);
	}
	
	public void paintComponent(Graphics graphics) {
		System.out.println("Updated!");
		super.paintComponent(graphics);
		
		// TODO: Draw grid
		
		// TODO: Draw moving block
		
		graphics.setColor(Color.RED);
		graphics.fillRect(0, 0, 10, 100);
		
		updates++;
		
		// Draw FPS and update time
		graphics.setColor(Color.BLACK);
		graphics.setFont(gameFont);
		graphics.drawString(getFPSLabelText(), 425, 22);
		
		timeSinceLastFrame = System.currentTimeMillis();
	}
}
