package bubble.test.ex13;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Bubble extends JLabel implements Moveable{
	
	//의존성 컴포지션
	private BubbleFrame mContext;
	private Player player;
	private BackgroundBubbleService backgroundBubbleService;
	
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

	
	

//	private ImageIcon playerR, playerL;
//	public Bubble(Player player,BubbleFrame mContext) {
		
	public Bubble(BubbleFrame mContext) {
		this.mContext = mContext;
		this.player = mContext.getPlayer();
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
			System.out.println("left");
			setLocation(x,y);
			if(backgroundBubbleService.leftWall()) {
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
				break;
			}
			
			try {
				Thread.sleep(1);
					
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		clearBubble();//천장에 버블 도착하고 3초후 메모리에서 소멸시킬거
	}
	
	//행위 ->clear(동사)->bubble(목적어)
	public void clearBubble() {
		try {
			Thread.sleep(3000);
			setIcon(bomb);
			Thread.sleep(500);
			mContext.remove(this);//BubbleFrame의 버블이 메모리에서 소멸된다.
			mContext.repaint();//메모리 없는거 들은 뺴고 있는거들만 잡아서 다시그림/
			//BubbleFrame의 전체를 다시 그림.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
