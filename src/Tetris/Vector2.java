package Tetris;

// The game is renderer on a grid, blocks's position and size are represented with integers.
public class Vector2 {
	public int x;
	public int y;
	
	public Vector2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Vector2 add(Vector2 other) {
		return new Vector2(x + other.x, y + other.y);
	}
	
	public Vector2 sub(Vector2 other) {
		return new Vector2(x - other.x, y - other.y);
	}
	
	public Vector2 mul(Vector2 other) {
		return new Vector2(x * other.x, y * other.y);
	}
	
	public Vector2 div(Vector2 other) {
		return new Vector2(x / other.x, y / other.y);
	}
	
	public float magnitude(Vector2 otherVector) {
		return (float) Math.sqrt(
			Math.pow((x - otherVector.x), 2) + Math.pow((y - otherVector.y), 2)
		);
	}
}
