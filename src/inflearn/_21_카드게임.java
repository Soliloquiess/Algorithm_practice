package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _21_카드게임 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
				
		//freopen("input.txt", "rt", stdin);
		int i, as = 0, bs = 0, lw = 0;
		int []A= new int[10];
		int[] B= new int[10]; 
		//as = a의 스코어 , bs=b의 스코어 lw = 라운드 승자
		st = new StringTokenizer(br.readLine()," ");
		for (i = 0; i < 10; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");
		for (i = 0; i < 10; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		for (i = 0; i < 10; i++) {
			if (A[i] > B[i]) {
				as = as + 3;
				lw = 1;
			}
			else if (A[i] < B[i]) {
				bs = bs + 3;
				lw = 2;
			}
			else {
				as += 1;
				bs += 1;
			}
		}
		System.out.printf("%d %d\n", as, bs);
		


		if (as == bs) {
			if (lw == 0) System.out.printf("D\n");
			else if (lw == 1) System.out.printf("A\n");
			else System.out.printf("B\n");	
			//마지막으로 이긴 라운드를 계산해서 출력 계산
		}
		else if (as > bs) System.out.printf("A\n");
		else System.out.printf("B\n");
	}
}