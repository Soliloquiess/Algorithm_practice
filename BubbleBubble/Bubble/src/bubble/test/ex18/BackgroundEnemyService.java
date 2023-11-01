package bubble.test.ex18;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

//���ν����� �ٻ� - Ű���� �̺�Ʈ ó���ϱ� �ٻ�
//��׶��忡�� ��� ����
public class BackgroundEnemyService implements Runnable{

	private BufferedImage image;
	
	private Enemy enemy;
	
	//�÷��̾�, ����, (������ �𸣸� �浹 ������ ���� ����)
//	public BackgroundPlayerService(BubbleFrame mContext) {
	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;
		try {
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			//
		}
	}
	

	@Override
	public void run() {
		while(enemy.getState()==0) {
			
			//2. �� �浹 üũ
			
		//����Ȯ��
			Color leftColor = new Color(image.getRGB(enemy.getX() -10 ,enemy.getY()+25));
			Color rightColor = new Color(image.getRGB(enemy.getX()+50+15, enemy.getY()+25));
			//-2�� ���´ٴ� ���� �ٴڿ� ������ ���� ����̶�� �ǹ�
			int bottomColor = image.getRGB(enemy.getX() +10 , enemy.getY()+50+5)	//-1
							+ image.getRGB(enemy.getX()+50 -10 , enemy.getY()+50+5);	//-232331, -1

			
			//�ٴ� �浹 Ȯ��
			if(bottomColor != -2) {
//				System.out.println("�����÷�"+bottomColor);
//				
//				System.out.println("�ٴڿ� �浹��");	�ٴ� �ƴ϶�� ������������
				
				enemy.setDown(false); 
			}
			else {//-2�϶� => �� �ٴ� ������ �Ͼ����.
				if(!enemy.isUp()&& !enemy.isDown()) {
//					System.out.println("�ٿ� �����");
					enemy.down();
				}
			}
			
			//�ܺ� �浹 Ȯ��
				if(leftColor.getRed()==255 && leftColor.getGreen()==0 && leftColor.getBlue()==0) {

					enemy.setLeft(false);
					if(!enemy.isRight()) {
						enemy.right();
					}
				}
				else if(rightColor.getRed()==255 && rightColor.getGreen()==0 && rightColor.getBlue()==0) {

					enemy.setRight(false);
					if(!enemy.isRight()) {

						enemy.left();
					}
					
				}

				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
