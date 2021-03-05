package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _22_온도의최댓값 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		//freopen("input.txt", "rt", stdin);
		int n, k, i, sum = 0, res;
		st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine()," ");
		int []a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] =Integer.parseInt(st.nextToken());

		}
		
		for (i = 0; i < k; i++) {	//연속 된 수 (주어진 k 만큼) 합 구하는 거
			//k는 2니까 맨 처음만 구하는거네. a[0]+a[1]만 구하고 
			sum = sum + a[i];
		}
		res = sum;
		for (i = k; i < n; i++) {	//실질적으론 여기서 다 돔
			sum = sum + a[i] - a[i - k];		//이렇게 쓰는게 더 낫겟다. 시발
			//sum = sum + (a[i] - a[i - k]);	
			//a[i]번째 ( 그 해당배열을 더하고) 연속된 부분 뺀다 (잘 모르겠으면 강의 참조)
			//섬 더하고 더하는 인덱스 값 더하고 맨 뒤에값 빼는거.

			if (sum > res) res = sum;	//(res=max가 sum 보다 크면 sum을 max(res)에 넣음)
		}
		System.out.println(res);
	}

}