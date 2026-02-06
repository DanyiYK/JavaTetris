package Rendering;

import java.awt.event.KeyEvent;

public interface Screen {
	void parseKey(Renderer renderer, KeyEvent e);
	void step(Renderer renderer);
}
