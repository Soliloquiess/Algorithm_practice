package SWEA;


import java.io.*;
import java.util.StringTokenizer;

public class SWEA_1974_스도쿠_검증 {

	static int[][] puzzle;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
        
		for(int tc=1; tc<=T; tc++) {
			puzzle = new int[9][9];
            
			for(int i=0; i<9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0; j<9; j++) {
					puzzle[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
            
			boolean flag = true;
            //모든 가로를 검사한다.
			for(int i=0; i<9; i++) {
				if(!checkGaro(i)) {
                	//한줄이라도 false이면 검사를 멈춘다.
					System.out.println("#"+tc+" "+0);
					flag = false;
					break;
				}
			}
			if(!flag) continue; //다음 테스트 케이스 실행
			
            
            //모든 세로를 검사
			for(int j=0; j<9; j++) {
				if(!checkSero(j)) {
					System.out.println("#"+tc+" "+0);
					flag = false;
					break;
				}
			}
			if(!flag) continue; //다음 테스트 케이스 실행
			
            
            //모든 3X3 격자칸 검사
            //격자칸의 각 시작점에서부터 검사
			for(int i=0; i<=6; i+=3) { //3칸씩 점프 (다음 격자칸 이동을 위해)
				for(int j=0; j<=6; j+=3) {
					if(!checkNemo(i,j)) {
						System.out.println("#"+tc+" "+0);
						flag = false;
						break;
					}
				}
				if(!flag) break;
			}
			if(!flag) continue;
			
            
            //위에서 모두 검사를 통과했다면 1을 출력
			System.out.println("#"+tc+" "+1);
			
		}
	}
	
    
	static boolean checkGaro(int x) {
		boolean[] check = new boolean[9];
		for(int j=0; j<9; j++) { // x행에 대하여 모든 j열을 검사.
			if(check[puzzle[x][j]-1]) //이미 해당 숫자를 가지고 있다.
				return false;
			check[puzzle[x][j]-1] = true;
		}
		
		return true;
	}
	
    
	static boolean checkSero(int y) {
		boolean[] check = new boolean[9];
		for(int i=0; i<9; i++) { // y열에 대하여 모든 i행을 검사.
			if(check[puzzle[i][y]-1]) //이미 해당 숫자를 가지고 있다.
				return false;
			check[puzzle[i][y]-1] = true;
		}
		return true;
	}
	
    
	static boolean checkNemo(int x, int y) {
		boolean[] check = new boolean[9];
		int nx = x+3;
		int ny = y+3;
        //x행 y열에서 시작하는 3X3 칸을 검사.
		for(int i=x; i<nx; i++) {
			for(int j=y; j<ny; j++) {
				if(check[puzzle[i][j]-1]) //이미 해당 숫자를 가지고 있다.
					return false;
				check[puzzle[i][j]-1] = true;
			}
		}
		return true;
	}


}

/*


import java.util.*;

public class s_1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t = 1; t <= test; t++) {
			int[][] a = new int[9][9];
			int flag = 1;
			for(int i = 0; i < 9; i++) {
				int sum = 0;
				for(int j = 0; j < 9; j++) {
					a[i][j] = sc.nextInt();
					sum += a[i][j];
				}
				if(sum != 45)
					flag = 0;
			}
			
			for(int i = 0; i < 9; i++) {
				int sum = 0;
				for(int j = 0; j < 9; j++) {
					sum += a[j][i];
				}
				if(sum != 45)
					flag = 0;
			}
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					int sum = 0;
					for(int k = 0; k < 3; k++) {
						for(int s = 0; s < 3; s++) {
							sum += a[3*i + k][3*j + s];
						}
					}
					if(sum != 45)
						flag = 0;
				}
			}
			System.out.println("#" + t + " " + flag);
		}
	}
}

*/