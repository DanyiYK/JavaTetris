package Tetris;

import javax.swing.JFrame;

import Rendering.Renderer;

@SuppressWarnings("serial")
public class Main extends JFrame {
	public static void main(String[] args) throws InterruptedException {
		// Make GameData
		
		GameData data = new GameData();
		Renderer gameRenderer = new Renderer(data);
		
		while(gameRenderer.isVisible()) {
			
			// check if (new_time-last_time) >= 1, if so, shift MovingBlock by one pixel
			
			gameRenderer.repaint();
			
			Thread.sleep(16); // ~60 frames per second
		}
		
		System.out.println("Game closed!");
		
		gameRenderer.dispose();
	}
}