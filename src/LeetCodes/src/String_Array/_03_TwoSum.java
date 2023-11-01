package String_Array;


import java.util.*;

public class _03_TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,8,11,14};
        int target =16;
        _03_TwoSum a = new _03_TwoSum();
        int[]  result = a.solve(nums, target);
        for(int i : result)
        	System.out.println(i);
	}
	
	//
	public int[] solve(int[] nums, int target) {
		//2.담을 그릇
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		//3.for
		for(int i=0; i<nums.length; i++) {	//자바에서 배열길이는 s()안붙고 스트링은()붙는다.
			if(map.containsKey(nums[i])){	//맵에 값이 있냐 체크(기본으로 알아야)
				
				int mapValue = map.get(nums[i]); //i=1일때 8 , map(8,0)
				result[0]  = mapValue +1; //1(0~3이 아니라 1과~4리턴이므로)
			    result[1]  = i+1 ;        //(14자체의 인덱스인 3에 +1한거)
				
			}else {
				map.put(target-nums[i], i); //key 10-2=8, value i=0 
				//키 밸류 넣어서 저장하다가 딱 14가 나오면? 위에 실행.(16-2=14)
			}
		}
		
		
		return result;
		
	}
}
