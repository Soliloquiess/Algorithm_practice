package bubble.test.ex15;

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
	
	private BubbleFrame mContext = this;//���� �����ִ� �������ϽŴ�.
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
//		getContentPane().setLayout(null);//absolute ���̾ƿ�(�����Ӱ� �׸� �׸� �� �ִ�.)
		setLayout(null);//absolute ���̾ƿ�(�����Ӱ� �׸� �׸� �� �ִ�.)
		setLocationRelativeTo(null);	//JFrame ��� ��ġ�ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x��ư���� â ���� JVM ���� �����ϱ�
		
	}
	private void initListner() {
		addKeyListener(new KeyAdapter() {
		
			//Ű���� Ŭ�� �̺�Ʈ �ڵ鷯
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
						//�ڵ� �ξ� ������
						//�÷��̾ 	���� ����°��� ���� �������� ���� ����°� �ƴϴ�.
						//�÷��̾ 	�����̽��� ���� ����� ��
						//�� ȣ��� ���� ��ü ���� ȭ�鿡 ����ְ� leftȤ�� right�� ������� ������.
						//�ڵ帮���丵 ��.
						player.attack();
						break;
					
				}
				
			}
			//Ű���� ���� �̺�Ʈ �ڵ鷯
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
