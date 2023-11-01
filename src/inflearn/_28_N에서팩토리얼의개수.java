package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


//int형 변수에 담으면 안된다. 1000! 이런거 구하면 되게 오래 걸리게 됨.
//27번 소인수 분해 했던거 적용해야.
//10 가정하면 1*2*3*4*5*6*7*8*9*10
				//이걸 4= 2*2, 6=2*3 이런거로 바꿔야.
//소인수 분해 하면서 2라는 인수 갯수와 5라는 인수 갯수 세야.

public class _28_N에서팩토리얼의개수 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc= new Scanner(System.in);
		int n, i, j, tmp, cnt1 = 0, cnt2 = 0;
//		scanf("%d", &n);
		n =Integer.parseInt(br.readLine());
		for (i = 2; i <= n; i++) {
			tmp = i;
			j = 2;
			while (true) {
				if (tmp % j == 0) {	//나눠 떨어지면 2면cnt1, 5면 cnt2에 개수 구함
					if (j == 2) cnt1++;
					else if (j == 5) cnt2++;
					tmp = tmp / j;
				}
				else j++;
				if (tmp == 1) break;
			}
		}
		if (cnt1 < cnt2) System.out.printf("%d\n", cnt1);
		else System.out.printf("%d\n", cnt2);
	}

}



