package bubble.test.ex18;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

//class Player ->new ������ �ֵ�. 
@Getter
@Setter
public class Enemy extends JLabel implements Moveable{
	
	private BubbleFrame mContext;
	//��ġ����
	private int x;
	private int y;
	
	//�÷��̾��� ����
	
	private EnemyWay enemyWay;
	
	//������ ����
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	private int state; //0 ����ִ»���, 1  ����￡ ���� ����
	
	//���� �浹�� ����(�ʿ���� Ű����� ������ �� �ƴ϶� �ڵ����� ��������������)
//	private boolean leftWallCrash;
//	private boolean rightWallCrash;
	
	//�÷��̾� �ӵ� ����
	private final int SPEED = 5;

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
		right();
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
		new Thread(new BackgroundEnemyService(this)).start();
		 
	}
	
	
//	@Override
//	������ ����� ������ �̷��� ����.
//	public void attack() {
//		new Thread(()-> {
//			Bubble bubble = new Bubble(mContext);
//			mContext.add(bubble); //ȭ�鿡 add����� ���´�.
//			//mCOntext�� ���� �������̰� ȭ�鿡 �����ְ� �ȴ�.
//			if(playerWay == PlayerWay.LEFT) {
//				bubble.left();
//			}else
//			{
//				bubble.right();
//			}	 
//		}).start();
//		
//	}
	
	//�̺�Ʈ �ڵ鷯
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
					Thread.sleep(10);//0.01��
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
					Thread.sleep(10);//0.01��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		}).start();
	}
	
	//left+up, right+up ���ÿ� �Ϸ��� ������ ������ �ʰ�� �Ұ���
	@Override
	public void up() {
		up = true;
		new Thread(()-> {
			for(int i = 0; i<130/JUMPSPEED; i++) {
				y=y-JUMPSPEED;
				setLocation(x,y);
				try {
					Thread.sleep(10);//0.01��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			up = false;	//�¿� �޼���� vk_�޼��忡�� false��
			down(); //�ٷ� �ٿ� �޼��� ����
		}).start();
	} 
	@Override
	public void down() {
		
		System.out.println("down");
		down = true;
		new Thread(()-> {
//			for(int i = 0; i<130/JUMPSPEED; i++) {	//for������ �ָ� �ȵ� ������ 130��ŭ �������� ���� while�� ��ߵ�
			while(down) {
				y=y+JUMPSPEED;
				setLocation(x,y);
				try {
					Thread.sleep(10);//0.01��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			down = false;
		}).start();
		
	}
}
