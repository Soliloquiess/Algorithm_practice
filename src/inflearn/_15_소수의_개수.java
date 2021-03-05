package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15_소수의_개수 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i, j, flag, cnt = 0;
	
		n = Integer.parseInt(br.readLine());
		for (i = 2; i <= n; i++) {
			flag = 1;
			for (j = 2;  j*j <= i; j++) { //for (j = 2;  j < i; j++) 이렇게 써도 실행은 됨(j<=i면 안된다! 자기 자신으로 나누면 무조건 1이 값나와서 소수 아니게 되므로)근데 이와 같이 하면 타임리미트 걸린다.
				//j*j는 제곱근 
				//36을 예로들면 1*36 2*18 3*12 4*9 6*6 처럼 왼쪽부분만 확인되면 오른쪽은 안해도 약수 있는거 알 수 있음.
				//루트 36까지만 돌리면 됨(루트 i까지)
				//j*j<=i해주면 제곱근 효과 나니까
				//여기서는 <=i해줘야(루트이므로 6 6 일때 딱 36)
				if (i % j == 0) {	//i가 소수가 아니면
					flag = 0;	//false
					break;
				}
			}
			//참인게 하나도 없으면
			if (flag == 1) cnt++;	//소수면 카운트 추가
		}
		System.out.printf("%d\n", cnt);
	}
}
