package inflearn_7_Recursive;

import java.util.*;
class _3_팩토리얼 {
	public int DFS(int n){
		if(n==1) return 1;
		else return n*DFS(n-1);
	}
	public static void main(String[] args){
		_3_팩토리얼 T = new _3_팩토리얼();
		System.out.println(T.DFS(5));
	}	
}