package BOJ;

//public class BOJ_10866_�� {
//
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
 
public class BOJ_10866_�� {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
 
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) {
 
			String[] s = br.readLine().split(" ");
 
			// ù ��° �ܾ ���� switch-case 
			switch (s[0]) {
 
				case "push_front": {
					dq.addFirst(Integer.parseInt(s[1]));
					break;
				}
				
				case "push_back": {
					dq.addLast(Integer.parseInt(s[1]));
					break;
				}
 
				case "pop_front": {
					if (dq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(dq.pollFirst()).append('\n');
					}
					break;
				}
 
				case "pop_back": {
					if (dq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(dq.pollLast()).append('\n');
					}
					break;
				}
 
				case "size": {
					sb.append(dq.size()).append('\n');
					break;
				}
 
				case "empty": {
					if (dq.isEmpty()) {
						sb.append(1).append('\n');
					} 
					else {
						sb.append(0).append('\n');
					}
					break;
				}
 
				case "front": {
					if (dq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(dq.peekFirst()).append('\n');
					}
					break;
				}
 
				case "back": {
					if (dq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(dq.peekLast()).append('\n');
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}

