package inflearn_2.Array;


import java.util.*;
class _9_격자판_최대합 {	
	public int solution(int n, int[][] arr){
		int answer=-2147000000;
		int sum1=0, sum2=0;
		for(int i=0; i<n; i++){
			sum1=sum2=0;
			for(int j=0; j<n; j++){
				sum1+=arr[i][j];	//행이 고정 열이 도는거
				sum2+=arr[j][i];	//행이 돌고 열이 고정되는거.
			}
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2);
		}
		sum1=sum2=0;
		for(int i=0; i<n; i++){
			sum1+=arr[i][i];	//우상향 대각선
			sum2+=arr[i][n-i-1];	//우하향 대각선
		}
		answer=Math.max(answer, sum1);
		answer=Math.max(answer, sum2);
		return answer;
	}

	public static void main(String[] args){
		_9_격자판_최대합 T = new _9_격자판_최대합();
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