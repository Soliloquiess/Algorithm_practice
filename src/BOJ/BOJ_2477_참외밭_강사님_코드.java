package BOJ;

import java.util.Scanner;

public class BOJ_2477_참외밭_강사님_코드 {

	public static void main(String[] args) {
	{
	
		Scanner sc=  new Scanner(System.in);
		
		
		int K = sc.nextInt();
		int [] a = new int[6];
		for(int i =0; i<6; i++) {
			sc.nextInt();
			a[i] = sc.nextInt();
		}
		int maxWidth = 1;
		int maxHeight = 1;
		
		for(int i =0;i<6;i++) {
			if(i%2==0) {	//짝수번쨰가 넓이
				if(maxWidth<a[i]) maxWidth =a[i];
//				maxWidth = Math.max(maxWidth, a[i]);
			}
			else {

				if(maxHeight<a[i]) maxHeight =a[i];
//				maxHeight = Math.min(maxHeight, a[i]);
			}
		}

		int Width = 500;
		int Height = 500;
		
		
		for(int i = 0; i<6;i++) {
			if(i%2==0) {	//이전+다음
				if(maxHeight == a[(i+5)%6]+a[(i+1)%6]) {
					//현재 번호에서 5를 더하면 내 앞에꺼가 됨.내앞에꺼 찾는데 5를 더해서 %6을 해야 
					//인덱스 번호 안에 들어옴.
					
					
					Width = a[i];
				}
			}else {
				if(maxWidth==a[(i+5)%6]+a[(i+1)%6]) {
					Height = a[i];			
				}
			}
		}
			System.out.println((maxWidth*maxHeight - Width*Height)*K);
		}
	}
}