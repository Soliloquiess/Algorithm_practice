package String_Array;


import java.util.HashSet;
import java.util.Set;

public class _07_JewelsAndStones {

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(solve(J, S));
	}

	public static int solve(String jew, String stone) {
		//1. 저장
		Set<Character> set = new HashSet<>();
		//2.stones 를 for문 돌림.
		for (char jewel : jew.toCharArray()) {	//이런거 너무 많이 나오니까 그냥 외우다 싶이 하자.
			//string을 어레이로 만들어서 char로 받음
			set.add(jewel); // 바꾼 내용을 set에 저장.
		}

		int count = 0;
		for (char stoneChar : stone.toCharArray()) {
			System.out.println("stoneChar: " + stoneChar);
			if (set.contains(stoneChar)) {	//set에 있는지 체크
				count++;
			}
		}
		return count;
	}
}