package Jungol;

import java.util.Scanner;


public class Jungol_1037_오류교정_강사님코드 {
	static int N;
	static int [][] a;
	static Scanner sc = new Scanner(System.in);
	
		static boolean sumCheck() {
			for (int i = 0; i<a.length;i++) {
				int isum =0;
				int jsum =0;
				for(int j =0; j<a.length;j++) {
//					System.out.print(a[i][j]+" ");
					isum = isum+a[i][j];
					jsum = jsum+a[j][i];
				}
//				System.out.println("sum="+sum);
				if(isum%2==1) return false;
				if(jsum%2==1) return false;
			}	
			return true;

		}
		

	public static void main(String[] args) {
		N = sc.nextInt();
		a = new int[N][N];
		for(int i = 0; i<N;i++) {
			for(int j =0;j<N;j++) {
				a[i][j]= sc.nextInt();
			}
		}
		//for(int[] ia : a) System.out.println(Arrays.toString(ia));
		
		if(sumCheck()) {
			System.out.println("OK");
	
			return;	
			//역량테스트는 리턴 구문 넣으면 안된다.왜냐면 테스트 케이스 계속 돌아야 되기 떄문 컨티뉴 쓰면 되기도 할지 모르겠으나 아무튼 그럼
			
		}else {
			boolean corrupted =true;
		loop: for(int i =0; i<N;i++) {
			for(int j =0; j<N;j++) {
				a[i][j] = a[i][j]==0?1:0;//0->1,1->0 visit =true;
				if(sumCheck()) {
						System.out.println("Change bit( "+(i+1)+","+(j+1)+")");
						corrupted =false;
						break loop;
						//return;
					}
					a[i][j] = a[i][j] ==0?1:0;
				}
			}
			if(corrupted) System.out.println("Corrupt");
		}
		
		
//		
//		if(sumCheck()) {
//			System.out.println("OK");
//	
//			return;	
//			//역량테스트는 리턴 구문 넣으면 안된다.왜냐면 테스트 케이스 계속 돌아야 되기 떄문 컨티뉴 쓰면 되기도 할지 모르겠으나 아무튼 그럼
//			
//		}
//		for(int i =0; i<N;i++) {
//			for(int j =0; j<N;j++) {
//				a[i][j] = a[i][j]==0?1:0;//0->1,1->0 visit =true;
//				if(sumCheck()) {
//						System.out.println("Change bit( "+(i+1)+","+(j+1)+")");
//						return;
//					}
//					a[i][j] = a[i][j] ==0?1:0;
//				}
//			}
//			System.out.println("Corrupt");
//		}
	}
}