package Tetris;

import javax.swing.JFrame;

import Rendering.Renderer;

public class Main extends JFrame {
	public static void main(String[] args) throws InterruptedException {
		// Make GameData
		
		Renderer gameRenderer = new Renderer();
		
		while(gameRenderer.isVisible()) {
			
			gameRenderer.repaint();
			
			Thread.sleep(16);
		}
		
		System.out.println("Game closed!");
		
		gameRenderer.dispose();
	}
}