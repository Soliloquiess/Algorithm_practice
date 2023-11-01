package inflearn_1.String;

import java.util.*;
class _9_숫자만_추출 {	
	public int solution(String s){	//int로 리턴
		int answer=0;
//		String answer="";
		for(char x : s.toCharArray()){
			if(x>=48 && x<=57) answer = answer*10 +(x-48);
			/*if(Character.isDigit(x)){	//istDigit는 숫자인지 참인지 물어봄 참이면 더해준다.
				answer=answer*10+ Character.getNumericValue(x);
			}*/
//			if(Character.isDigit(x)) answer+=x;
		}
		return answer;
//		return Integer.parseInt(answer);	//parseInt가 있는데 이렇게 하면 0280이 숫자가 됨
	}

	public static void main(String[] args){
		_9_숫자만_추출 T = new _9_숫자만_추출();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.print(T.solution(str));
	}
}