package bubble.test.ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//class Player ->new 가능한 애들. 
public class Player extends JLabel implements Moveable{
	private int x;
	private int y;
	
	//움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
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
	
	//이벤트 핸들러
	@Override
	public void left() {
		x=x-10;
		setLocation(x,y);
	}
	@Override
	public void right() {
		x=x+10;
		setLocation(x,y);
	}
	@Override
	public void up() {
		
		
	}
	@Override
	public void down() {
		
		
	}
}
