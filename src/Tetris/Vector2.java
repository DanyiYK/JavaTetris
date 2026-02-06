package Tetris;

public class Vector2 {
	int x;
	int y;
	
	Vector2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public float magnitude(Vector2 otherVector) {
		return (float) Math.sqrt(
			Math.pow((x - otherVector.x), 2) + Math.pow((y - otherVector.y), 2)
		);
	}
}
