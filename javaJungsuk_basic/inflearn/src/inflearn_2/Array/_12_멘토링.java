package inflearn_2.Array;

import java.util.*;
class _12_멘토링 {	
	public int solution(int n, int m, int[][] arr){
		int answer=0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				int cnt=0;
				for(int k=0; k<m; k++){	//시험개수
					int pi=0, pj=0;
					for(int s=0; s<n; s++){	//n명
						if(arr[k][s]==i) pi=s;	//i가 멘토, j가 멘티
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m){
					answer++;
					//System.out.println(i+" "+j);
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_12_멘토링 T = new _12_멘토링();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}