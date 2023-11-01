package bubble.test.ex02;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class BubbleFrame extends JFrame {
	
	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true);		
	}
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		
		player = new Player();
		
		add(player);
//		backgroundMap.setSize(100,100);
//		backgroundMap.setLocation(300,300);
//		backgroundMap.setSize(1000,600);
//		add(backgroundMap);//jframe에 jlabel이 그려진다.
	}
	private void initSetting() {
		setSize(1000,640);
//		getContentPane().setLayout(null);//absolute 레이아웃(자유롭게 그림 그릴 수 있다.)
		setLayout(null);//absolute 레이아웃(자유롭게 그림 그릴 수 있다.)
		setLocationRelativeTo(null);	//JFrame 가운데 배치하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x버튼으로 창 끌때 JVM 같이 종료하기
		
	}
	
	public static void main(String[] args) {
	
		new BubbleFrame();
	}
	
}
