package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14_뒤집은_소수 {
		

	static int reverse(int x) {		//주어진 수를 뒤집는 과정.
		int res = 0, tmp;
		while (x > 0) {
			tmp = x % 10;		//52 기준  1회 tmp= 2 res=  2회에 tmp=5
			res = res * 10 + tmp;
			x = x / 10;			//x=5되므로 다시 위로 올라가고  2회에 5/10 = 0.5= 0이니까 while문 빠져나옴 
		}
		return res;
	}
	
	static Boolean isPrime(int x) {		//x로 역으로 순서 짜여진 숫자들이 넣어지게 된다.(뒤집은 숫자 소수 판별)
		int i;
		if (x == 1) return false;	//1은 소수가 아니므로 항상 false(출력하면 안됨.)
		boolean flag = true;	//처음에 참.
		for (i = 2; i < x; i++) {
			if (x % i == 0) {		//조건 성립시 i는 x의 약수
				flag = false;		//소수아니니까 false 시켜서 출력 안되게 한다.
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n, num, i, tmp;
			n = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			for (i = 1; i <= n; i++) {
				num = Integer.parseInt(st.nextToken());
				tmp = reverse(num);	//먼저 뒤집고 소수인지 확인한다.
				if (isPrime(tmp)) System.out.printf("%d ", tmp);	//tmp가 소수인지 확인하는 isprime 그리고 tmp만 출력하면 됨.
			}
		}
}