package bubble.test.ex01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;

public class BubbleFrame extends JFrame {
	
	public BubbleFrame() {
		setSize(1000,640);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		getContentPane().add(chckbxNewCheckBox, BorderLayout.WEST);
		setVisible(true);		
	}
	public static void main(String[] args) {
	
		new BubbleFrame();
	}
	
}
