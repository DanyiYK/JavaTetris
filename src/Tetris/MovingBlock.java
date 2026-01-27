package Tetris;

public class MovingBlock {
	int[][] matrix;
	int[][] original_matrix;
	int centerX, centerY;
	
	public MovingBlock(int[][] matrix, int centerX, int centerY) {
		this.original_matrix = matrix;
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	public static MovingBlock[] initMainBlocks() {
		MovingBlock[] blocks = new MovingBlock[10];
		
		int[][] blockForm = {
			{1, 1},
			{1, 1}
		};
		blocks[0] = new MovingBlock(blockForm, 0, 0); 
		
		int[][] SForm = {
				{0, 1, 1},
				{1, 1, 0}
			};
		blocks[1] = new MovingBlock(SForm, 0, 0); 		
		
		int[][] LForm = {
				{1, 1, 1},
				{1, 0, 0}
			};
		blocks[0] = new MovingBlock(LForm, 0, 0); 
		
		return blocks;
	}
}
