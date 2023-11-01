package Sort;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {	//BOJ_1181_�ܾ�����
	public static void main(String[] args) {
		String[] arr = { "13", "i", "more", "im" };

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// �ܾ� ���̰� ���� ���
				if (s1.length() == s2.length()) {

					return s1.compareTo(s2);	//��������
					}// �� ���� ���
				else {
					return s1.length() - s2.length();
				}
			}
 });

// Arrays.sort(arr, (a,b) -> b.length() - a.length());

		System.out.println(arr[0]);

		for (int i = 1; i < arr.length; i++) { 
			if (!arr[i].equals(arr[i - 1])) {	// �ߺ����� �ʴ� �ܾ ���

				System.out.println(arr[i]);
				}
			}
		}
	
}