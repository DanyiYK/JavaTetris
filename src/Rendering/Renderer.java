package Rendering;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import Rendering.GameScreens.*;

public class Renderer extends JFrame implements KeyListener {
	private static final int START_SCREEN = 0;
	private static final long serialVersionUID = 1L;
	
	public Screen[] gameScreens = {
		new Menu(),
		new Settings(),
		new MainGame(),
	};
	
	public Screen currentScreen; // Start screen should be the menu!
	
	public Renderer() {
		setTitle("Tetris");
		
		// Iterate all screens and add them to the Frame
		JPanel screen;
		for(int i = 0; i < gameScreens.length; i++) {
			screen = (JPanel) gameScreens[i];
			screen.setVisible(false);
			
			add(screen);
		}

		setScreen(START_SCREEN);
		
		pack();
		setResizable(false);
		
		addKeyListener(this);
		
		setVisible(true);
	}

	// Changes between MainMenu/MainGame/Settings
	public void setScreen(int screenCode) {
		if(screenCode < 0 || screenCode >= gameScreens.length) {
			System.err.printf("Invalid screenCode! 1$ is out of bounds for gameScreens array.", screenCode);
			return;
		}
		
		for(int i = 0; i < gameScreens.length; i++) {
			((JPanel) gameScreens[i]).setVisible(i==screenCode);
		}
		
		currentScreen = gameScreens[screenCode];
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
