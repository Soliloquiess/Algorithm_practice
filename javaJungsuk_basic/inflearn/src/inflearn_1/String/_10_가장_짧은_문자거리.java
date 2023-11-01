package inflearn_1.String;


import java.util.*;
class _10_가장_짧은_문자거리 {	
	public int[] solution(String s, char t){	//문자열과 문자 받고ㅗ
		int[] answer=new int[s.length()];	//s길이만큼 넘김
		int p=1000;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==t){
				p=0;
				answer[i]=p;	
			}
			else{	//아니면 P그대로 증가시키고 answer에 p넣어줌
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=s.length()-1; i>=0; i--){
			if(s.charAt(i)==t) p=0;
			else{
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_10_가장_짧은_문자거리 T = new _10_가장_짧은_문자거리();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();	//문자열 읽음
		char c=sc.next().charAt(0);	//문자 하나를 읽음
		for(int x : T.solution(str, c)){	//문자열과 문자를 넘김
			System.out.print(x+" ");
		}
	}
}