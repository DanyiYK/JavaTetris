package Rendering.GameScreens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import Rendering.GraphicUtility;
import Rendering.Renderer;
import Rendering.Screen;

public class Menu extends JPanel implements Screen {
	private static final String[] options = {
		"Play!",
		"Options",
		"Credits"
	};
	
	private int selectedOption = 0;
	
	@Override
	public void parseKey(Renderer renderer, KeyEvent e) {
		renderer.setScreen(1);
	}

	@Override
	public void step(Renderer renderer) {
		System.out.println("Stepped!");
		this.repaint();
	}

	public Dimension getPreferredSize() {
		return new Dimension(480, 720);
	}
	
	public void paintComponent(Graphics graphics) {
		int width = this.getWidth();
		int height = this.getHeight();
		
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, width, height);
		
		graphics.setColor(Color.MAGENTA);		
		graphics.setFont(new Font("Arial", Font.BOLD, 48));
		GraphicUtility.draw_centered_string(graphics, "Tetris", width/2, height/2-50);
		
		graphics.setFont(main_font);
		graphics.setColor(Color.BLACK);
		GraphicUtility.draw_centered_string(graphics, "Play!", width/2, height/2);
		GraphicUtility.draw_centered_string(graphics, "Settings", width/2, height/2+22);
	}

}
