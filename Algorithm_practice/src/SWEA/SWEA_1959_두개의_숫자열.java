package SWEA;
//
//public class SWEA_1959_두개의_숫자열 {
//
//}
import java.io.*;
import java.util.*;

public class SWEA_1959_두개의_숫자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		

		for(int tc=1;tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] a = new int[N];
			int[] b = new int[M];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				b[j] = Integer.parseInt(st.nextToken());
			}
			
			int max = 0;
			int tmp = 0;
			if(N < M) {
				
				for(int j=0; j<=M-N; j++) { //인덱스가 M-N을 넘어가면 비교할 범위(N개)가 넘어가므로
					int k=j; //비교할 위치
					int sum = 0;
					for(int i=0; i<N; i++) { //N개만큼동안 a배열과 b배열의 값을 곱해준다.
						tmp = a[i] * b[k++]; //a배열값과 b배열값 곱해주기
						sum += tmp; //곱한 값을 계속 더해준다.
					}
					if(sum > max) max = sum; //최댓값을 저장
				}

			} else if(N == M) { //크기가 같은 경우에 최댓값의 경우는 한가지.
				for(int i=0; i<N; i++) {
					max += a[i]*b[i];
				}
			} else { // N이 더 큰 경우. M이 더 큰 경우와 반대로 해주면 된다.
				for(int j=0; j<=N-M; j++) {
					int k=j;
					int sum = 0;
					for(int i=0; i<M; i++) {
						tmp = a[k++] * b[i];
						sum += tmp;
					}
					if(sum > max) max = sum;
				}
			}
			
			System.out.println("#"+tc+" "+max);
		}
	}

}