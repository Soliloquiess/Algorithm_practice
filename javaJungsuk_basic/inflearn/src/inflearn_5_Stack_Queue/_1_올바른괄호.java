package inflearn_5_Stack_Queue;

import java.util.*;
class _1_올바른괄호 {	
	public String solution(String str){
		String answer="YES";
		Stack<Character> stack=new Stack<>();
		for(char x : str.toCharArray()){
			if(x=='(') stack.push(x);	//여는 괄호
			else{
				if(stack.isEmpty()) return "NO";	//비어있는지 물어봄
				stack.pop();	//참이 아니면 pop시킨다.
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}

	public static void main(String[] args){
		_1_올바른괄호 T = new _1_올바른괄호();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}