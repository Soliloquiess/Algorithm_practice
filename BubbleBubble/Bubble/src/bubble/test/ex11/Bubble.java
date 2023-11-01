package bubble.test.ex11;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Bubble extends JLabel implements Moveable{
	
	//의존성 컴포지션
	private Player player;
	
	//위치상태
	private int x;
	private int y;
	
	//움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
//	private boolean down; 물방울은 다운 절대 못함
	
	//적군을 맞춘 상태
	private int state; //0 물방울, 1 적을 가둔 물방울
	
	private ImageIcon bubble;	//그냥 물방울
	private ImageIcon bubbled;// 적을 가둔 물방울
	private ImageIcon bomb; //물방울 터짐

	
	
	//벽에 충돌한 상태 이거도 물방울에선 필요 없음
//	private boolean leftWallCrash;
//	private boolean rightWallCrash;
	
	//플레이어 속도 상태
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
		initThread();
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
	
	private void initThread() {
		//버블은 스레드가 하나만 생성
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
			setLocation(x,y);
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
			setLocation(x,y);
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
			try {
				Thread.sleep(1);
					
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
