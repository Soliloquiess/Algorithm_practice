package inflearn_1.String;

import java.util.*;
class _8_유효한_팰린드롬 {	
	public String solution(String s){
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]", "");	//A~Z까지 문자 아니면 공백까지 포함 다 제거
		//정규식으로 replaceAll 사용 [^A-Z] 알파벳 대문자가 아니면(꺽쇠는 부적) 빈문자화 시켜라 그럼 x가 다 ㅏ제거됨.
		//위 구문 실행시 알파벳 이외 숫자라던지 문자 다 제거.
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";	//이게 같으면 답은 YES출력
		return answer;
	}

	public static void main(String[] args){
		_8_유효한_팰린드롬 T = new _8_유효한_팰린드롬();
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();	//한 줄을 읽음.
		System.out.print(T.solution(str));
	}
}