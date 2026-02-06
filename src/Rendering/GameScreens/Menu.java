package Rendering.GameScreens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import Rendering.GraphicUtility;
import Rendering.Renderer;
import Rendering.Screen;

public class Menu extends JPanel implements Screen {
	private static final String[] options = {
		"Play",
		"Options",
		"Credits"
	};
	
	private int selectedOption = 0;
	
	public void select_option(Renderer renderer) {
		switch(selectedOption) {
		case 0:
			break;
		case 1:
			renderer.setScreen(1);
			break;
		}
	}
	
	@Override
	public void parseKey(Renderer renderer, KeyEvent e) {
		switch(e.getKeyCode()) {
		case 38: // Up
			selectedOption = selectedOption-1==-1?options.length-1:selectedOption-1;
			break;
		case 40: // Down
			selectedOption = selectedOption+1==options.length?0:selectedOption+1;
			break;
		case 10: // Enter
			select_option(renderer);
			break;
		}
		System.out.println(selectedOption);
	}

	@Override
	public void step(Renderer renderer) {
		this.repaint();
	}

	public Dimension getPreferredSize() {
		return new Dimension(480, 720);
	}
	
	public void paintComponent(Graphics graphics) {
		int width = this.getWidth();
		int height = this.getHeight();
		
		graphics.setColor(new Color(185, 100, 100));
		graphics.fillRect(0, 0, width, height);
		
		graphics.setFont(new Font("Arial", Font.BOLD, 48));
		
		graphics.setColor(Color.BLUE);		
		GraphicUtility.draw_string_with_shadow(graphics, "Tetris", width/2, height/2-50, new Color(0, 0, 100));
		
		graphics.setFont(main_font);
		graphics.setColor(Color.BLACK);
		
		boolean isSelected;
		String str;
		for(int i = 0; i < options.length; i++) {
			isSelected = i==selectedOption;
			str = (isSelected? "> ":"") + options[i] + (isSelected? " <":"");
			
			graphics.setColor(isSelected? Color.CYAN:Color.WHITE);
			GraphicUtility.draw_centered_string(graphics, str, width/2, height/2 + 44*i);
			
			//GraphicUtility.draw_centered_string(graphics, (isSelected? "> ":"") + options[i] + (isSelected? " <":""), width/2, height/2 + (6 + main_font.getSize()) * i);
		}
	}

}
