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
				
				
				//test	�پ� ������ �� ���꽺Ʈ������ ǥ��
				firstStr = firstStr.substring(0, firstStr.length() - 1);
				//test,tes,te
				//0������ 
			}
		
		}
		return firstStr;
	}
}

//���� ���������̰ų� ���� ���� ���� �� �ϳ��ε� ���� �� ���ų� �������� �ϱ� �Ȱ� ���������̸鼭 ����� ���� ��ǻ�Ϳ� ���� ���� ���� ���� �������� 4��������� ���� ���� ���ƺ��̴� �����ڰ� �ϰ� �; �Դ�. �³�?