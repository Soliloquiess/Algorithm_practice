package bubble.test.ex16;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lombok.Getter;
import lombok.Setter;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;


@Getter
@Setter
public class BubbleFrame extends JFrame {
	
	private BubbleFrame mContext = this;//메인 가진애는 적으라하신다.
	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		initListner();
		setVisible(true);		
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		
		player = new Player(mContext);
		
		add(player);

		enemy = new Enemy(mContext);
		add(enemy);
	}
	private void initSetting() {
		setSize(1000,640);
//		getContentPane().setLayout(null);//absolute 레이아웃(자유롭게 그림 그릴 수 있다.)
		setLayout(null);//absolute 레이아웃(자유롭게 그림 그릴 수 있다.)
		setLocationRelativeTo(null);	//JFrame 가운데 배치하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x버튼으로 창 끌때 JVM 같이 종료하기
		
	}
	private void initListner() {
		addKeyListener(new KeyAdapter() {
		
			//키보드 클릭 이벤트 핸들러
			@Override
			public void keyPressed(KeyEvent e) {
		
				switch(e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						if(!player.isLeft()&&!player.isLeftWallCrash()) {

							player.left();	
						}
						break;
					case KeyEvent.VK_RIGHT:
						if(!player.isRight()&&!player.isRightWallCrash()) {

							player.right();	
						}
						break;
					case KeyEvent.VK_UP:
						if(!player.isUp()&& !player.isDown()) {
							player.up();
						}
						break;
					case KeyEvent.VK_SPACE:
//						if(!player.isUp()&& !player.isDown()) {
//							Bubble bubble = new Bubble(mContext);
//							Bubble bubble = new Bubble(this);
//							add(bubble);
						
//						}
						//코드 훨씬 좋아짐
						//플레이어가 	버블 만드는거지 버블 프레임이 버블 만드는게 아니다.
						//플레이어가 	스페이스로 어택 만들면 됨
						//얘 호출시 버블 객체 만들어서 화면에 집어넣고 left혹은 right를 스레드로 실행함.
						//코드리팩토링 끝.
						player.attack();
						break;
					
				}
				
			}
			//키보드 해제 이벤트 핸들러
			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						player.setLeft(false);
						break;
					case KeyEvent.VK_RIGHT:
						player.setRight(false);
						break;
					
				}
			}
		});
		
	}
	public static void main(String[] args) {
	
		new BubbleFrame();
	}
	
}
