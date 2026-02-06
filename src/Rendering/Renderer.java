package Rendering;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import Rendering.GameScreens.*;

public class Renderer extends JFrame implements KeyListener {
	private static final int START_SCREEN = 0;
	private static final long serialVersionUID = 1L;
	
	static enum screenType {
			menu,
			settings,
			game
	}
	
	public Screen[] gameScreens = {
		new Menu(),
		new Settings(),
		new MainGame(),
	};
	
	public Screen currentScreen; // Start screen should be the menu!
	
	public Renderer() {
		setTitle("Tetris");
		
		setScreen(START_SCREEN);
		
		pack();
		setResizable(false);
		
		addKeyListener(this);
		
		setVisible(true);
	}

	// Switches between MainMenu/MainGame/Settings
	public void setScreen(int screenCode) {
		if(screenCode < 0 || screenCode >= gameScreens.length) {
			System.err.printf("Invalid screenCode! 1$ is out of bounds for gameScreens array.", screenCode);
			return;
		}
		
		add((JPanel) gameScreens[screenCode]);
		this.currentScreen = gameScreens[screenCode];
		
		pack();
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(480, 720);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(currentScreen == null) {
			return;
		}
		
		currentScreen.parseKey(this, e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
