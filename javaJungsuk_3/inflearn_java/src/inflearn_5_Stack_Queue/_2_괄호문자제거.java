package inflearn_5_Stack_Queue;

import java.util.*;
class _2_괄호문자제거 {	
	public String solution(String str){
		String answer="";
		Stack<Character> stack=new Stack<>();	//여기다 문자 넣어야 한다.
		for(char x : str.toCharArray()){
			if(x==')'){
				while(stack.pop()!='(');
			}
			else stack.push(x);
		}
		for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
		return answer;
	}

	public static void main(String[] args){
		_2_괄호문자제거 T = new _2_괄호문자제거();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}