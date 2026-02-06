package Rendering.GameScreens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import Rendering.Renderer;
import Rendering.Screen;

public class Settings extends JPanel implements Screen {

	@Override
	public void parseKey(Renderer renderer, KeyEvent e) {
		renderer.setScreen(2);
	}

	@Override
	public void step(Renderer renderer) {
		this.repaint();
	}

	public Dimension getPreferredSize() {
		return new Dimension(480, 720);
	}
	
	public void paintComponent(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0,this.getWidth() , this.getHeight());
		
		graphics.setFont(main_font);
		
		graphics.setColor(Color.BLACK);
		graphics.drawString("Settings", 0, 22);
	}
}
