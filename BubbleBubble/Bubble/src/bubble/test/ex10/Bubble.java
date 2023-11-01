package bubble.test.ex10;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Bubble extends JLabel{
	
	//������ ��������
	private Player player;
	
	//��ġ����
	private int x;
	private int y;
	
	//������ ����
	private boolean left;
	private boolean right;
	private boolean up;
//	private boolean down; ������� �ٿ� ���� ����
	
	//������ ���� ����
	private int state; //0 �����, 1 ���� ���� �����
	private ImageIcon bubble;	//�׳� �����
	private ImageIcon bubbled;// ���� ���� �����
	private ImageIcon bomb; //����� ����

	
	
	//���� �浹�� ���� �̰ŵ� ����￡�� �ʿ� ����
//	private boolean leftWallCrash;
//	private boolean rightWallCrash;
	
	//�÷��̾� �ӵ� ����
//	private final int SPEED = 4;
//	private final int JUMPSPEED = 3;
	
//	public boolean isLeft() {
//		return left;
//	}
	
//	private ImageIcon playerR, playerL;
	public Bubble(Player player) {
		this.player = player;
		initObject();
		initSetting();
	}
	private void initObject() {
		bubble = new ImageIcon("image/bubble.png");
		bubbled = new ImageIcon("image/bubbled.png");
		bomb = new ImageIcon("image/bomb.png");
	}
	private void initSetting() {
		left = false;
		right = false;
		up = false;
		
		x = player.getX();
		y = player.getY();
		
		setIcon(bubble);
		setSize(50,50);
		
		state = 0;
	}
}
