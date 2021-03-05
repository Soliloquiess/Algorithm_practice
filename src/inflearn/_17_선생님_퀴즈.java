package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _17_선생님_퀴즈 {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		st = new StringTokenizer(br.readLine()," ");		int n, sum = 0, i, j, m, ans;
//		scanf("%d", &n);
		n= Integer.parseInt(st.nextToken());
		for (i = 1; i <= n; i++) {
			
		st = new StringTokenizer(br.readLine()," ");


//			scanf("%d %d", &m, &ans);
			sum = 0;		//sum 이 0되서 구해야  중요한 건 두번쨰 학생 구할때 sum=0으로 초기화 해야한다. 
			m=Integer.parseInt(st.nextToken());
			ans = Integer.parseInt(st.nextToken());
			//sum =0 초기화 안해서 틀리는 경우가 많다.
			for (j = 1; j <= m; j++) {			//첫번째 학생 먼저 구하고 
				sum += j;
			}
			if (ans == sum) 
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}
}