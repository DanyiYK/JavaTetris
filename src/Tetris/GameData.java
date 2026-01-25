package Tetris;

public class GameData {
	public int score = 0;
	public Grid gameGrid;
	
	public GameData() {
		Grid gameGrid = new Grid();
		
		this.gameGrid = gameGrid;
	}
}
