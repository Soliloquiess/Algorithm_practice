package inflearn_7_Recursive;

import java.util.*;
class _2_이진수출력_재귀 {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n/2);
			System.out.print(n%2);
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		_2_이진수출력_재귀 T = new _2_이진수출력_재귀();
		T.solution(11);
		//System.out.println(T.solution(3));
	}	
}
