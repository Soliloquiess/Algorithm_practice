package String;

public class _02_toCharArray {

	
public static void main(String[] args) {
		
//		String s = "(a(b(c)d)";
//		String s = "(((a(b(c(e(f)d))";
//	    String  s = "in(f(lea)r)n)";
		String  s = "a)b(c)d(";
//		String  s = "a)b(c)d)";

//		String  s = "(()))";
//		String  s = "(()";
//	    String  s = "))((";
		System.out.println(new _02_toCharArray().solve(s));
	}
	public String solve(String s) {
		//1
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		int openBrace=0; // '('
		
		//2 count 
		for(char c: s.toCharArray()) {
			System.out.println("c "+c);
			if(c=='(') {
				openBrace++;
			}else if(c==')') {
				if(openBrace==0) continue;	//)가 (없이 처음 나왔을때
				openBrace--;	
			}
			sb.append(c);//그대로 저장	//"a)b(c)d)";
		}
		
		System.out.println("1_sb== "+sb);
		//3 제외 할 대상만 빼고 그대로 저장
		for(int i=sb.length()-1; i>=0; i--) {
			System.out.println("sb "+sb.charAt(i));
			if(sb.charAt(i)=='(' && openBrace-- > 0) {	//(이거나 괄호가 0보다 크면
				continue;
			}
			result.append(sb.charAt(i));
		}
		return result.reverse().toString();
		
	}
}