package inflearn_2.Array;

import java.util.*;
class _10_봉우리 {	
	int[] dx={-1, 0, 1, 0};
	int[] dy={0, 1, 0, -1};
	public int solution(int n, int[][] arr){
		int answer=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				boolean flag=true;
				for(int k=0; k<4; k++){	//k는 4방향 더해주는거
					int nx=i+dx[k];	//i 행번호
					int ny=j+dy[k];	//j 열번호
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
														//arr[nx][ny]는 4방향의 방향의 값이 4방향에 1개라도 있으면 false
						//arr[nx][ny]>=arr[i][j] 이게 한번도 참이 안된건 상하좌우가 나보다 작다는 뜻 //그떄 봉우리니까 카운트
//						nx>=0 && nx<n && ny>=0 && ny<n  이부분은 범위 벗어나는거(0으로 설정한 부분들을 참조해서 거기를 벗어나지 않게.
//						arr[nx][ny]>=arr[i][j] 그리고 이부분이 뒤로가야됨 먼저 실행되면 안됨(범위설정이 먼저 실행되어야)
						flag=false;	
						break;
					}
				}
				if(flag) answer++;	//그떄 봉우리니까 카운트
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_10_봉우리 T = new _10_봉우리();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}