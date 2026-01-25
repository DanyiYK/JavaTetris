package Rendering;

import javax.swing.JFrame;

public class Renderer extends JFrame {
	private static final long serialVersionUID = 1L;
	public GamePanel panel;
	
	public Renderer() {
		setTitle("Tetris");
		
		GamePanel panel = new GamePanel();
		this.panel = panel;
		
		add(panel);
		
		pack();
		setResizable(false);

		setVisible(true);
	}
}
