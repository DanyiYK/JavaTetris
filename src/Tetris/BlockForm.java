package Tetris;

public class BlockForm {
	public int[][] form;
	public int centerX, centerY;
	
	public BlockForm(int[][] form, int centerX, int centerY) {
		this.form = form;
		this.centerX = centerX;
		this.centerY = centerY;
	}
}
