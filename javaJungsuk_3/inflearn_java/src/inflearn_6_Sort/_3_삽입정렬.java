package inflearn_6_Sort;


import java.util.*;
class _3_삽입정렬 {	
	public int[] solution(int n, int[] arr){
		for(int i=1; i<n; i++){
			int tmp=arr[i], j;
			for(j=i-1; j>=0; j--){	//역순으로 돈다.
				if(arr[j]>tmp) arr[j+1]=arr[j];	//j가 tmp보다 크면 뒤로 밀려야 한다.
				else break;	//아니몀 멈춘다
			}
			arr[j+1]=tmp;	//j가 멈춘 지점에 +1지점에 tmp를 넣어야 한다.
		}
		return arr;
	}
	public static void main(String[] args){
		_3_삽입정렬 T = new _3_삽입정렬();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}