package bubble.test.ex08;

public interface Moveable {
	public abstract void left();
	public abstract void right();
	public abstract void up();
	public abstract void down();
	
}

enum Direction {
	// 0, 1, 2, 3
	LEFT, RIGHT, UP, DOWN;
}