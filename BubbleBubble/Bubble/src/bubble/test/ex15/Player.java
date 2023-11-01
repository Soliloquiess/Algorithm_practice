package bubble.test.ex15;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

//class Player ->new ������ �ֵ�. 
@Getter
@Setter
public class Player extends JLabel implements Moveable{
	
	private BubbleFrame mContext;
	//��ġ����
	private int x;
	private int y;
	
	//�÷��̾��� ����
	
	private PlayerWay playerWay;
	
	//������ ����
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	//���� �浹�� ����
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	
	//�÷��̾� �ӵ� ����
	private final int SPEED = 4;

	private final int JUMPSPEED = 3;
	
//	public boolean isLeft() {
//		return left;
//	}
	
	private ImageIcon playerR, playerL;
	
	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initObject();
		initSetting();
		initBackgroundPlayerService();
	}
	
	private void initObject() {
		playerR= new ImageIcon("image/playerR.png");
		playerL= new ImageIcon("image/playerL.png");
	}
	private void initSetting() {
		x = 80;
		y = 535;
		
		left = false;
		right = false;
		up = false;
		down = false;
		
		leftWallCrash = false;
		rightWallCrash = false;
		
		playerWay = PlayerWay.RIGHT;
		this.setIcon(playerR);
		this.setSize(50,50);
		setLocation(x,y);
	}
	
	
	private void initBackgroundPlayerService() {
		new Thread(new BackgroundPlayerService(this)).start();
	}
	
	@Override
	public void attack() {
		new Thread(()-> {
			Bubble bubble = new Bubble(mContext);
			mContext.add(bubble); //ȭ�鿡 add����� ���´�.
			//mCOntext�� ���� �������̰� ȭ�鿡 �����ְ� �ȴ�.
			if(playerWay == PlayerWay.LEFT) {
				bubble.left();
			}else
			{
				bubble.right();
			}	 
		}).start();
		
	}
	
	//�̺�Ʈ �ڵ鷯
	@Override
	public void left() {
//		System.out.println("left");

		playerWay = PlayerWay.LEFT;
		left = true;
		new Thread(()-> {
			while(left) {
				setIcon(playerL);
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

		playerWay = PlayerWay.RIGHT;
		right = true;
		new Thread(()-> {
			while(right) {
				
				setIcon(playerR);
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
