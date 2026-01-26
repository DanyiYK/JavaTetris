package Tetris;

public class GameData {
	public int score = 100000;
	public Grid gameGrid;
	
	// Settings
	int pixelSize = 30;
	public int gridSizeX = 10;
	public int gridSizeY = 20;
	public int startGridPositionX = 20;
	public int startGridPositionY = 50;
	
	public GameData() {
		this.gameGrid = new Grid(this);
	}
}
