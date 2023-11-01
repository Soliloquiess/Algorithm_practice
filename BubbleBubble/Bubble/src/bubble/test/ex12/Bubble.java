package bubble.test.ex12;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Bubble extends JLabel implements Moveable{
	
	//������ ��������
	private Player player;
	private BackgroundBubbleService backgroundBubbleService;
	
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

	
	

//	private ImageIcon playerR, playerL;
	public Bubble(Player player) {
		this.player = player;
		initObject();
		initSetting();
		initThread();
	}
	
	private void initObject() {
		bubble = new ImageIcon("image/bubble.png");
		bubbled = new ImageIcon("image/bubbled.png");
		bomb = new ImageIcon("image/bomb.png");

		backgroundBubbleService = new BackgroundBubbleService(this);
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
	
	private void initThread() {
		//������ �����尡 �ϳ��� ����
		new Thread(()->{
			if(player.getPlayerWay() == PlayerWay.LEFT) {
				left();
			}
			else {
				right();
			}
		}).start();	
	}
	
	@Override
	public void left() {
		left = true;
		for (int i =0; i<400;i++) {
			x--;
			System.out.println("left");
			setLocation(x,y);
			if(backgroundBubbleService.leftWall()) {
				left = false;
				break;
			}
			
			try {
				Thread.sleep(1);
					
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		up();
	}
	
	@Override
	public void right() {
		right = true;
		for (int i =0; i<400;i++) {
			x++;

			System.out.println("rightt");
			setLocation(x,y);
			if(backgroundBubbleService.rightWall()) {
				right = false;
				break;
			}
			try {
				Thread.sleep(1);
					
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
		
	}
	
	@Override
	public void up() {
		up = true;
		while(up) {
			y--;
			setLocation(x,y);
			if(backgroundBubbleService.topWall()) {
				up = false;
				break;
			}
			
			try {
				Thread.sleep(1);
					
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		clearBubble();//õ�忡 ���� ���� �� 3�� �� �޸� �Ҹ��ų��
	}
	public void clearBubble() {
			
		try {
			Thread.sleep(3000);
			setIcon(bomb);
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
