package inflearn_1.String;

import java.util.*;
public class _1_����_ã�� {

	public int solution(String str, char t){
		int answer=0;
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		//System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
		for(char x : str.toCharArray()){
			if(x==t) answer++;
		}
		return answer;
	}

	public static void main(String[] args){
		_1_����_ã�� T = new _1_����_ã��();
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		char c= sc.next().charAt(0);	//���ڿ� �ϳ��� ������
		System.out.print(T.solution(str, c));
	}
}