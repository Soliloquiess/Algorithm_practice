package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _23_연속부분증가수열 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc= new Scanner(System.in);
		int n, i, pre, now, cnt, max;
		
		n = Integer.parseInt(br.readLine());
		pre = sc.nextInt();
		cnt = 1;
		max = 1;

		for (i = 2; i <= n; i++) {
//			scanf("%d", &now);	//pre 이후 숫자.
			now = sc.nextInt();
			if (now >= pre) {
				cnt++;
				if (cnt > max) max = cnt;
			}
			else cnt = 1;	//현재 읽은 숫자가  앞에 숫자보다 작으면 cnt를 1로 만들고
			pre = now;		//읽은 숫자를 pre에  놓고 다시 돌게.
		}
		System.out.println(max);
	}
}