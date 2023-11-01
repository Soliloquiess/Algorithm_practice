package BackTracking;


import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(new Permutation().solve(nums));
	}

	public List<List<Integer>> solve(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();
		//templist에 하나씩 담으며 채워서 result 채움.
		
		backtrack(result, tempList, nums);
		return result;
	}
	int count =0;
	private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
//		System.out.println("tempList: "+tempList);
//		count++;
//		System.out.println("count "+count);
		if (tempList.size() == nums.length) {
			result.add(new ArrayList<>(tempList));
		} else {	//백트래킹 일로 와서 도는거.
			for (int i = 0; i < nums.length; i++) {
			//	System.out.println("11tempList: "+tempList+" nums["+i+"]:"+nums[i]);	
				if (tempList.contains(nums[i])) {
			//	System.out.println("12tempList: "+tempList+" nums["+i+"]:"+nums[i]);	
					continue; //templist에 nums[i]가 하나라도 담겨있으면 패스하는 거.
				}
					
		//		System.out.println("i "+i);
				tempList.add(nums[i]);
		//		System.out.println("22tempList: "+tempList);
				backtrack(result, tempList, nums);
				//백트랙 쌓고 나서
				tempList.remove(tempList.size() - 1);
				//나올때는 제거를 해준다.
				//다시 하나 지워서 위로 가야(나가야) 로그 찍어서 확인해보자.
		//		System.out.println("33tempList: "+tempList);
			}
		}
		//System.out.println("====end====================="+count );
	}
}