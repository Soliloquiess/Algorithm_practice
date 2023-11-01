package inflearn_5_Stack_Queue;

import java.util.*;
class _6_공주구하기 {	
	public int solution(int n, int k){
		int answer=0;
		Queue<Integer> Q=new LinkedList<>();
		for(int i=1; i<=n; i++) Q.offer(i);	
		while(!Q.isEmpty()){
			for(int i=1; i<k; i++) Q.offer(Q.poll());	//꺼내고 값을 리턴받음 이걸 넣어줌(offer)
			Q.poll();
			if(Q.size()==1) answer=Q.poll();	//Q사이즈가 1이다. 이걸 뽑아서 answer에 넣어줌.
		}
		return answer;
	}
	public static void main(String[] args){
		_6_공주구하기 T = new _6_공주구하기();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}