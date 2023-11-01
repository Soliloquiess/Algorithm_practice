package inflearn_6_Sort;


import java.util.*;
class _6_장난꾸러기 {	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer=new ArrayList<>();
		int[] tmp=arr.clone();	//복사해준다.
		Arrays.sort(tmp);		//sort해서 tmp정렬
		for(int i=0; i<n; i++){	
			if(arr[i]!=tmp[i]) answer.add(i+1);	//같지 않으면 해당 배열 위치를 answer에 넣어준다.
		}
		return answer;
	}
	public static void main(String[] args){
		_6_장난꾸러기 T = new _6_장난꾸러기();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}