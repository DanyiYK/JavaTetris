package Rendering.GameScreens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import Rendering.GraphicUtility;
import Rendering.Renderer;
import Rendering.Screen;
import Tetris.MovingBlock;

public class MainGame extends JPanel implements Screen {
	public final Grid grid = new Grid();
	public MovingBlock[] movingBlocks = new MovingBlock[2];
	
	@Override
	public void parseKey(Renderer renderer, KeyEvent e) {
		renderer.setScreen(0);
	}
	
	public void start(Renderer renderer, Settings settings) {
		// Setup game (create first moving blocks, set base game speed and idk)
	}
	
	@Override
	public void step(Renderer renderer) {
		this.repaint();
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(480, 720);
	}
	
	public void paintComponent(Graphics graphics) {
	
	}
}
