package inflearn_2.Array;

import java.util.*;
class _11_임시반장정하기 {	
	public int solution(int n, int[][] arr){
		int answer=0, max=0;
		for(int i=1; i<=n; i++){
			int cnt=0;
			for(int j=1; j<=n; j++){
				for(int k=1; k<=5; k++){
					if(arr[i][k]==arr[j][k]){
						cnt++;
						break;
					}
				}
			}
			if(cnt>max){
				max=cnt;
				answer=i;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_11_임시반장정하기 T = new _11_임시반장정하기();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n+1][6];
		for(int i=1; i<=n; i++){
			for(int j=1; j<=5; j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}