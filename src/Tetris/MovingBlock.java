package Tetris;

import java.awt.event.KeyEvent;

public class MovingBlock {
	int[][] form;
	int centerX, centerY, positionX, positionY;
	
	public MovingBlock() {
		
	}
	
	public void setForm(BlockForm form) {
		this.form = form.form;
		this.centerX = form.centerX;
		this.centerY = form.centerY;
		
		this.positionX = 0;
		this.positionY = 0;
	}
	
	public boolean check_for_collision(Grid grid, int future_position_x, int future_position_y) {
		// block position is start_grid_position + block_relative_position + block_position - this.center
		for(int y = 0; y < this.form.length; y++) {
			for(int x = 0; x < this.form[y].length; x++) {
				
			}
		}
		
		return true;
	}
	
	public void parseKey(KeyEvent key) {
		
	}
	
	public void paint() {
		
	}
}
