package String;

//public class _01_codeAt {
//
//}



public class _01_codeAt {

	public static void main(String[] args) {
		
		String str1 ="123";
		String str2 ="888";
		//string으로 더하면 문자열로  나오니까 Integer로 바꾸고 더해야.
		//charAt은 특정 문자열의 위치를 지정해서 뽑아낸다.
		//
		System.out.println(new _01_codeAt().solve(str1, str2));
	}

	public String solve(String num1, String num2) {
		int carry = 0;
		int i = num1.length() - 1, j = num2.length() - 1;	//2
		StringBuilder sb = new StringBuilder();		
		
		while (i >= 0 || j >= 0) {							//둘다 0번방 까지 가야한다.
			int n1 = 0, n2 = 0;
			if (i >= 0) {
				n1 = num1.charAt(i) - '0';	//String->Integer로 변환.
			}
			if (j >= 0) {
				n2 = num2.charAt(j) - '0';	//String->Integer로 변환.
			}
			int sum = n1 + n2 + carry;		//11	(더한거)
			carry = sum / 10;				//1		(몫 값)
			sb.append(sum % 10);			//sum의 나머지 값.
			i--;							//num1Length--;	
			j--;							//num2Length--;
		}

		if (carry != 0) {					//
			sb.append(carry);
		}

		return sb.reverse().toString();		//그냥 toString하면 1101이 나옴. 반대로 출력해야.
	}

}
