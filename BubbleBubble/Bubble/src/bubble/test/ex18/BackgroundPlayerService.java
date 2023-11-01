package bubble.test.ex18;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

//메인스레드 바쁨 - 키보드 이벤트 처리하기 바쁨
//백그라운드에서 계속 관찰
public class BackgroundPlayerService implements Runnable{

	private BufferedImage image;
	
	private Player player;
	private List <Bubble> bubbleList;
	
	//플레이어, 버블, (버블을 모르면 충돌 감지할 수가 없다)
//	public BackgroundPlayerService(BubbleFrame mContext) {
	public BackgroundPlayerService(Player player) {
		this.player = player;
		this.bubbleList = player.getBubbleList();	//플레이어가 버블을 만듬 
		try {
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			//
		}
	}
	

	@Override
	public void run() {
		while(true) {
			//1.버블 충돌 체크
			for(int i =0; i<bubbleList.size();i++) {
				Bubble bubble = bubbleList.get(i);
				
				if(bubble.getState()==1) {
					if((Math.abs(player.getX()-bubble.getX())<10) && 
							Math.abs(player.getY()-bubble.getY())>0 && Math.abs(player.getY()-bubble.getY())<50) {
						System.out.println("적군 사살 완료");
						new Thread(()->{

							bubble.clearBubbled();
						}).start();
						break;
					}
				}
			}
			
			
			//2. 벽 충돌 체크
			
		//색상확인
			Color leftColor = new Color(image.getRGB(player.getX() -10 ,player.getY()+25));
			Color rightColor = new Color(image.getRGB(player.getX()+50+15, player.getY()+25));
			//-2가 나온다는 뜻은 바닥에 색깔이 없이 흰색이라는 의미
			int bottomColor = image.getRGB(player.getX() +10 , player.getY()+50+5)	//-1
							+ image.getRGB(player.getX()+50 -10 , player.getY()+50+5);	//-232331, -1

			
			//바닥 충돌 확인
			if(bottomColor != -2) {
//				System.out.println("바텀컬러"+bottomColor);
//				
//				System.out.println("바닥에 충돌함");	바닥 아니라면 낭떠러지란거
				
				player.setDown(false); 
			}
			else {//-2일때 => 내 바닥 색깔이 하얀색임.
				if(!player.isUp()&& !player.isDown()) {
//					System.out.println("다운 실행됨");
					player.down();
				}
			}
			
			//외벽 충돌 확인
				if(leftColor.getRed()==255 && leftColor.getGreen()==0 && leftColor.getBlue()==0) {
//					System.out.println("왼쪽 벽에 충돌함");
					player.setLeftWallCrash(true);
					player.setLeft(false);
				}
				else if(rightColor.getRed()==255 && rightColor.getGreen()==0 && rightColor.getBlue()==0) {
//					System.out.println("오른쪽 벽에 충돌함");
					player.setRightWallCrash(true);
					player.setRight(false);
				}
				else {
					player.setLeftWallCrash(false);
					player.setRightWallCrash(false);
				}
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
