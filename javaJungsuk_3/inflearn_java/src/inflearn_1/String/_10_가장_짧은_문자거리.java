package inflearn_1.String;



import java.util.*;
public class _2_��ҹ���_��ȯ {
	public String solution(String str){
		String answer="";	//���ڿ� �ϳ� ����
		for(char x : str.toCharArray()){
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);

		}
		return answer;
	}

	public static void main(String[] args){
		_2_��ҹ���_��ȯ T = new _2_��ҹ���_��ȯ();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.print(T.solution(str));
	}
}

//�̰� �ƽ�Ű�ѹ��� ����
//import java.util.*;
//class Main {	
//	public String solution(String str){
//		String answer="";
//		for(char x : str.toCharArray()){
//			if(x>=97 && x<=122) answer+=(char)(x-32);
//			else answer+=(char)(x+32);
//		}
//		return answer;
//	}
//
//	public static void main(String[] args){
//		Main T = new Main();
//		Scanner sc = new Scanner(System.in);
//		String str=sc.next();
//		System.out.print(T.solution(str));
//	}
//}