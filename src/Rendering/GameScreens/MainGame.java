package Rendering.GameScreens;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import Rendering.Renderer;
import Rendering.Screen;

public class MainGame extends JPanel implements Screen {

	@Override
	public void parseKey(Renderer renderer, KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void step(Renderer renderer) {
		this.repaint();
	}
	
	public void paintComponent(Graphics graphics) {
		
	}

}
