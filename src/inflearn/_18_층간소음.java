package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _18_층간소음 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		st = new StringTokenizer(br.readLine()," ");		

		int n, val, i, num, cnt = 0, max = -2147000000;
		
		n= Integer.parseInt(st.nextToken());
		val = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");	
//		
		for (i = 1; i <= n; i++) {
			num = Integer.parseInt(st.nextToken());
			if (num > val) cnt++;
			else cnt = 0;
			if (cnt > max) max = cnt;
		}
		if (max == 0) System.out.println("-1");		//경보음이 없으면 -1을 출력해야 한다.(참이 한번도 안되면 계속 0 그리고 n만큼 다 돌면 max도 0이였으므로 -1 출력)

		else System.out.println(max);
	}
}