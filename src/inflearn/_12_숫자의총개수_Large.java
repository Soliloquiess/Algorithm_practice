package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12_숫자의총개수_Large {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, sum = 0, cnt = 1, digit = 9, res = 0;
		//n은 넣는 변수 sum은 누적수 cnt는 카운트(1자리 숫자 2자리 숫자) digit이 자릿수의 개수.(변하는 거)
		/*
		1*9 =9
		2 90대까지
		3  900대까지
		4 9000대까지
		256을 예로들면 256-99 = 157
		한자리수는 9개니까 1*9 하고 두자리수는 90개니까 2*90하고
		세자리수는 157개가 있는거 그럼 157*3 하면 되는거 이런식으로 접근.
		그럼 가중치 해서 660 출력

		*/
		n= Integer.parseInt(br.readLine());
		while (sum + digit < n) {	//n이 1이면 기본 cnt가 1이니까 그대로 1 출력
			//digit이 자릿수 개수 (1은 9개 2는 90개 ...
			sum = sum + digit;
			res = res + (cnt * digit);
			cnt++;
			digit = digit * 10;
		}
		//256은 999보다 작으니까 while문에서 나오고 n값인 256-99 =157에 자릿수 cnt인 3 을 곱해주면 됨,.
		res = res + ((n - sum) * cnt);
		System.out.printf("%d\n", res);
	}
}
