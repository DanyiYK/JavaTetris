package Tetris;

public class GameData {
	public int score = 100000;
	public Grid gameGrid;
	public BlockForm[] forms;
	
	// Settings
	int pixelSize = 30;
	public int gridSizeX = 10;
	public int gridSizeY = 20;
	public int startGridPositionX = 20;
	public int startGridPositionY = 50;
	
	public GameData() {
		this.forms = initBlockForms();
		this.gameGrid = new Grid(this);
	}
	
	public BlockForm[] initBlockForms() {
		BlockForm[] formArray = new BlockForm[1];
		
		int[][] block = {{1, 1}, {1, 1}};
		formArray[0] = new BlockForm(block, 0, 0);
		
		return formArray;
	}
}
