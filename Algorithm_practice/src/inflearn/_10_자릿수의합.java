package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10_자릿수의합 {
	static int digit_sum(int x) {
		int sum = 0, tmp;
		while (x > 0) {	//125는 참이므로 
			tmp = x % 10;			//최초 x=125일때 tmp 5 sum 5, 한 바퀴 돌고 x=12,tmp=2,sum=7, 또 한바퀴돌고 x=1,tmp=1, sum =8
									//그리고 0 되고 sum 리턴.
			sum = sum + tmp;
			x = x / 10;
		}
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int n, num, i, sum, max = -2147000000, res = 0;
		
	
		n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for (i = 1; i <= n; i++) {

			num =  Integer.parseInt(st.nextToken());
			sum = digit_sum(num);		//digit_sum 함수로 num값 넘어감.
			if (sum > max) {
				max = sum;
				res = num;
			}
			else if (sum == max) {		//구하다 보니 원래 max값인 max와 구한 sum값이 같으면.
				if (num > res) res = num;		//지금 현재 숫자 num이 기존값 res보다 크면 자연수 자체가 큰 값을 res에 넣어야.
												//자릿수의 합이 같더라도 큰 값 출력
				//num 은 sum으로 들어온 숫자, res는 max값 지니던 숫자.
			}
		}
		System.out.printf("%d\n", res);
	}
}