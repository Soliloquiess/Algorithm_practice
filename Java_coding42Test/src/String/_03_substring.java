package String;

//public class _03_substring {
//
//}

public class _03_substring {

	public static void main(String[] args) {
		String str[] = { "test", "teacher" };
		System.out.println(new _03_substring().solve(str));
		
	}


	public String solve(String[] strs) {
		if (strs.length == 0)
			return "";
		String firstStr = strs[0];
		for (int i = 1; i < strs.length; i++) {
			
			while (strs[i].indexOf(firstStr) != 0) {
				
				
				//test	줄어 나가는 건 서브스트링으로 표현
				firstStr = firstStr.substring(0, firstStr.length() - 1);
				//test,tes,te
				//0번부터 
			}
		
		}
		return firstStr;
	}
}

//나는 비전공충이거나 고졸 지잡 문돌 중 하나인데 딱히 몸 쓰거나 힘든일은 하기 싫고 간지나보이면서 취업률 좋고 컴퓨터엔 게임 말고 좆도 관심 없었지만 4차산업인지 뭔지 전망 좋아보이는 개발자가 하고 싶어서 왔다. 맞노?