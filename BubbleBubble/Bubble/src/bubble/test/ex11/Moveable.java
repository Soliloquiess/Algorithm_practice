package bubble.test.ex11;

/*
default를 사용시 인터페이스도 몸체가 있는 메서드를 만들 수 있다. (extends를 쓰면 다중상속이 안되므로. 다중상속이 안 되는 것들이 많기 떄문)
그래서 어댑터 패턴보다는 default 쓰는게 좋다.
 * */
public interface Moveable {
	public abstract void left();
	public abstract void right();
	public abstract void up();
//	public abstract void down();
	default public  void down() {};//자바 높은 버전에서 나옴.
	
	//어댑터 패턴 써보자
}

enum Direction {
	// 0, 1, 2, 3
	LEFT, RIGHT, UP, DOWN;
}