package Rendering;

import java.awt.Font;
import java.awt.event.KeyEvent;

public interface Screen {
	static Font main_font = new Font("Arial", Font.PLAIN, 12);
	void parseKey(Renderer renderer, KeyEvent e);
	void step(Renderer renderer);
	
}
