package Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jungol_1733_오목2 {
	public static int [][] m = new int[19+2][19+2]; //배열의 경계 테두리를 1줄 사용
	private static int answerColor=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 1; i<=19;i++) {	// 0번은 안 씀, 1~19
			String line = br.readLine();
			for(int j = 1, index=0; j<=19;j++,index+=2) {
				m[i][j] = line.charAt(index) - '0';	//입력, 0:없음, 1:검,2:흰
			}
		}
		for (int r = 1; r<=19;r++) {	//행
			for(int c = 1; c<=19; c++) {	//열
				if(m[r][c] ==0) { continue;}	//돌이 놓여있지 않으면 다음칸으로 넘어가기
				if(complete(r,c)) { // 오목이면 true;
					System.out.println(answerColor);
					System.out.println(r+" "+c);
					return;	// 프로그램 종료
				}
			}
		}
		System.out.println(0);
	}	//end of main
	/* r,c, 좌표에서 시작하는 오목이 되었는지 확인 오목이면 true, 아니면 false리턴 메서드 */
	 private static int[] dr = {-1,0,1,1}; // 우상,우,우하,하
	 private static int[] dc = {1,1,1,0}; // 우상,우,우하,하
	 
	 public static boolean complete(int r, int c) {
		 int color = m[r][c];
dir:	 for(int k = 0; k<dc.length;k++) {	//4가지 오목방향
			 if(m[r-dr[k]][c-dc[k]]==color) { //이전 칸은 다른색인지
				 continue; //다음방향으로 넘어가기 
			 }
			 for(int i =1; i<5; i++) {	//오목인지 확인
				 if(m[r+dr[k]*i][c+dc[k]*i]!=color) {	//같은색이여야함.
					 continue dir; //다음 방향으로 넘어가기
				 }	//이후 칸은 다른색인지
			 }	
			 //오목임
			 answerColor = color;
			 return true;
		 }	//end of for k
		 return false; //오목 아님
	 }
}
