package Rendering;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import Tetris.GameData;

public class Renderer extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;
	public GamePanel panel;
	public GameData gameData;
	
	public Renderer(GameData data) {
		this.gameData = data;
		
		setTitle("Tetris");
		
		GamePanel panel = new GamePanel(data);
		this.panel = panel;
		
		add(panel);
		
		pack();
		setResizable(false);
		
		addKeyListener(this);
		
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Move block
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
