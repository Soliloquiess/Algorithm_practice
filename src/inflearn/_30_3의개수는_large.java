package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _30_3의개수는_large {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc= new Scanner(System.in);

		int n, left =77 , right, cur, k = 1, res = 0;

		//레프트가 77일 이유가 있나..? 1넣어도 작동.

		//여기 설명 복잡하므로 강의 보고 참고하자.
		//12345 기준 1235 1240 1246 1000

//		scanf("%d", &n);s
		n= Integer.parseInt(br.readLine());
		while (left != 0) {	//0되면 멈춤
	
			left = n / (k * 10);	//12345 /10 =1234
			right = n % k;			//12345 %1 =0 (1로 나누면 모든수는 0이 됨)
			cur = (n / k) % 10;		//cur는 현재자리숫자 위치. 5 나옴.
	
	
			if (3 < cur) {			//현재 자릿수가 3보다 크면 
				res = res + ((left + 1) * k);		//lt에 플러스 +1 해주고 *k 곱해준다.
			}
			else if (3 == cur) {	//자릿수가 3과 같다면.
				res = res + ((left * k) + (right + 1));		//left에 +1 해주면 안됨.(3이라 치면 그 갯수에 k곱하고 뒤에 rt 있는데
				//00~45까지 생기므로 +1 해줘야.
			}
	
			else res = res + (left * k);	//3보다 작을 때는 lt에 그대로 k곱하면 됨.
			k = k * 10;
		}
		System.out.printf("%d\n", res);
	}
}