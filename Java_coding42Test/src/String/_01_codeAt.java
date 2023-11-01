package String;

//public class _01_codeAt {
//
//}



public class _01_codeAt {

	public static void main(String[] args) {
		
		String str1 ="123";
		String str2 ="888";
		//string���� ���ϸ� ���ڿ���  �����ϱ� Integer�� �ٲٰ� ���ؾ�.
		//charAt�� Ư�� ���ڿ��� ��ġ�� �����ؼ� �̾Ƴ���.
		//
		System.out.println(new _01_codeAt().solve(str1, str2));
	}

	public String solve(String num1, String num2) {
		int carry = 0;
		int i = num1.length() - 1, j = num2.length() - 1;	//2
		StringBuilder sb = new StringBuilder();		
		
		while (i >= 0 || j >= 0) {							//�Ѵ� 0���� ���� �����Ѵ�.
			int n1 = 0, n2 = 0;
			if (i >= 0) {
				n1 = num1.charAt(i) - '0';	//String->Integer�� ��ȯ.
			}
			if (j >= 0) {
				n2 = num2.charAt(j) - '0';	//String->Integer�� ��ȯ.
			}
			int sum = n1 + n2 + carry;		//11	(���Ѱ�)
			carry = sum / 10;				//1		(�� ��)
			sb.append(sum % 10);			//sum�� ������ ��.
			i--;							//num1Length--;	
			j--;							//num2Length--;
		}

		if (carry != 0) {					//
			sb.append(carry);
		}

		return sb.reverse().toString();		//�׳� toString�ϸ� 1101�� ����. �ݴ�� ����ؾ�.
	}

}
