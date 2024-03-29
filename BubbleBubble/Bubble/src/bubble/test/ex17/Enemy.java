package bubble.test.ex17;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

//class Player ->new 가능한 애들. 
@Getter
@Setter
public class Enemy extends JLabel implements Moveable{
	
	private BubbleFrame mContext;
	//위치상태
	private int x;
	private int y;
	
	//플레이어의 방향
	
	private EnemyWay enemyWay;
	
	//움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	private int state; //0 살아있는상태, 1  물방울에 갇힌 상태
	
	//벽에 충돌한 상태(필요없음 키보드로 움직일 게 아니라 자동으로 적군은움직여서)
//	private boolean leftWallCrash;
//	private boolean rightWallCrash;
	
	//플레이어 속도 상태
	private final int SPEED = 3;

	private final int JUMPSPEED = 1;
	
//	public boolean isLeft() {
//		return left;
//	}
	
	private ImageIcon enemyR, enemyL;
	
	public Enemy(BubbleFrame mContext) {
		this.mContext = mContext;
		initObject();
		initSetting();
		initBackgroundEnemyService();
	}
	
	private void initObject() {
		enemyR= new ImageIcon("image/enemyR.png");
		enemyL= new ImageIcon("image/enemyL.png");
	}
	private void initSetting() {
		x = 480;
		y = 178;
		
		left = false;
		right = false;
		up = false;
		down = false;
		
		state= 0;
//		leftWallCrash = false;
//		rightWallCrash = false;
		
		enemyWay = EnemyWay.RIGHT;
		this.setIcon(enemyR);
		this.setSize(50,50);
		setLocation(x,y);
	}
	
	
	private void initBackgroundEnemyService() {
//		new Thread(new BackgroundEnemyService(this)).start();
		 
	}
	
	
//	@Override
//	적군은 물방울 날리고 이런게 없다.
//	public void attack() {
//		new Thread(()-> {
//			Bubble bubble = new Bubble(mContext);
//			mContext.add(bubble); //화면에 add해줘야 나온다.
//			//mCOntext가 버블 프레임이고 화면에 보여주게 된다.
//			if(playerWay == PlayerWay.LEFT) {
//				bubble.left();
//			}else
//			{
//				bubble.right();
//			}	 
//		}).start();
//		
//	}
	
	//이벤트 핸들러
	@Override
	public void left() {
//		System.out.println("left");

		enemyWay = EnemyWay.LEFT;
		left = true;
		new Thread(()-> {
			while(left) {
				setIcon(enemyL);
				x=x-SPEED;
				setLocation(x,y);
				try {
					Thread.sleep(10);//0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		}).start();	
		
	}
	@Override
	public void right() {

//		System.out.println("right");

		enemyWay = EnemyWay.RIGHT;
		right = true;
		new Thread(()-> {
			while(right) {
				
				setIcon(enemyR);
				x=x+SPEED;
				setLocation(x,y);
				try {
					Thread.sleep(10);//0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		}).start();
	}
	
	//left+up, right+up 동시에 하려면 스레드 만들지 않고는 불가능
	@Override
	public void up() {
		up = true;
		new Thread(()-> {
			for(int i = 0; i<130/JUMPSPEED; i++) {
				y=y-JUMPSPEED;
				setLocation(x,y);
				try {
					Thread.sleep(10);//0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			up = false;	//좌우 메서드는 vk_메서드에서 false줌
			down(); //바로 다운 메서드 실행
		}).start();
	} 
	@Override
	public void down() {
		
		System.out.println("down");
		down = true;
		new Thread(()-> {
//			for(int i = 0; i<130/JUMPSPEED; i++) {	//for문으로 주면 안됨 무조건 130만큼 떨어지기 때문 while로 줘야됨
			while(down) {
				y=y+JUMPSPEED;
				setLocation(x,y);
				try {
					Thread.sleep(10);//0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			down = false;
		}).start();
		
	}
}
