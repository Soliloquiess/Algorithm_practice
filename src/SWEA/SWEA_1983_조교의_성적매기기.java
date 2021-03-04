package SWEA;

import java.util.*;

public class SWEA_1983_조교의_성적매기기 {
	 static String[] score={"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt(); //학생 수
			int K = sc.nextInt(); //알고싶은 학생의 번호
			
			double find_score = 0.0; //K번호의 점수를 찾기 위해 저장
			Double[] result = new Double[N];
			
			//입력받기
			for(int i=0;i<N;i++) {
				int mid_score = sc.nextInt();//중간고사 점수
				int final_score = sc.nextInt();//기말고사 점수
				int sub_score = sc.nextInt();//과제 점수
				double sum = 0.35 * mid_score + 0.45 * final_score + 0.20 * sub_score; //총점
				result[i] = sum;
				if(i+1==K) find_score = sum;
			}
			
			Arrays.sort(result, Collections.reverseOrder());
			
			int index = 0;
			for(int i=0;i<result.length;i++) {
				if(result[i]==find_score) {
					index = i;
				}
			}
			
			index = index / (N/10);
			
			System.out.printf("#%d %s\n",tc,score[index]);
			
			
			
			
			
			
		}
	}
}
