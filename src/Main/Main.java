package Main;

import javax.swing.JFrame;

import Rendering.Renderer;

public class Main extends JFrame {
	Renderer renderer;
	
	public Main() throws InterruptedException {
		renderer = new Renderer();
		
		initializeMainLoop();
	}
	
	public void initializeMainLoop() throws InterruptedException {
		while(renderer.isVisible()) {
			
			// check if (new_time-last_time) >= 1, if so, shift MovingBlock by one pixel
			
			renderer.currentScreen.step(renderer);
			
			Thread.sleep(16); // ~60 frames per second
		}
		
		System.out.println("Game closed!");
		
		renderer.dispose();
	}
	
	public static void main(String[] args) throws InterruptedException {
		new Main();
	}
}