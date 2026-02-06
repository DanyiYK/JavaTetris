package Rendering.GameScreens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;

import javax.swing.JPanel;

import Rendering.GraphicUtility;
import Rendering.Renderer;
import Rendering.Screen;

public class MainGame extends JPanel implements Screen {

	@Override
	public void parseKey(Renderer renderer, KeyEvent e) {
		renderer.setScreen(0);
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
