package bubble.test.ex04;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

//class Player ->new ������ �ֵ�. 
@Getter
@Setter
public class Player extends JLabel implements Moveable{
	private int x;
	private int y;
	
	//������ ����
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	//�÷��̾� �ӵ� ����
	private final int SPEED = 3;
	
//	public boolean isLeft() {
//		return left;
//	}
	
	private ImageIcon playerR, playerL;
	
	public Player() {
		initObject();
		initSetting();
	}
	private void initObject() {
		playerR= new ImageIcon("image/playerR.png");
		playerL= new ImageIcon("image/playerL.png");
	}
	private void initSetting() {
		x = 55;
		y = 535;
		
		left = false;
		right = false;
		up = false;
		down = false;
		
		
		this.setIcon(playerR);
		this.setSize(50,50);
		setLocation(x,y);
	}
	
	//�̺�Ʈ �ڵ鷯
	@Override
	public void left() {
		System.out.println("left");
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

		System.out.println("right");
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
	@Override
	public void up() {
		
		
	}
	@Override
	public void down() {
		
		
	}
}
