package bubble.test.ex18;

/*
default�� ���� �������̽��� ��ü�� �ִ� �޼��带 ���� �� �ִ�. (extends�� ���� ���߻���� �ȵǹǷ�. ���߻���� �� �Ǵ� �͵��� ���� ����)
�׷��� ����� ���Ϻ��ٴ� default ���°� ����.
 * */
public interface Moveable {
	public abstract void left();
	public abstract void right();
	public abstract void up();
//	public abstract void down();
	default public  void down() {};//�ڹ� ���� �������� ����.
	default public  void attack() {};//�ڹ� ���� �������� ����.
	
	//����� ���� �Ẹ��
}

enum Direction {
	// 0, 1, 2, 3
	LEFT, RIGHT, UP, DOWN;
}