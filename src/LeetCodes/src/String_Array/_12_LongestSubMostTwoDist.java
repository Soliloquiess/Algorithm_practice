package String_Array;

import java.util.HashMap;
import java.util.Map;

public class _12_LongestSubMostTwoDist {


	public static void main(String[] args) {
		String s = "ccaabbb";
		System.out.println(lengthOfLongestSubstringTwoDistinct(s));
	}
	    public static int lengthOfLongestSubstringTwoDistinct(String s) {
	        Map<Character,Integer> map = new HashMap<>();
	        int start = 0, end = 0, counter = 0, len = 0;
	        while(end < s.length()){
	            char endChar = s.charAt(end);
	            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
	            //c가 endchar 0은 디폴트 value	c가 한번 들어오면1 됨 2번쨰 들어오면 그 값꺼내던가 그값 없으면 0을 줌.
	            //이 위 메서드들도 많이 나오니까 알아두자.
	            //c=2,a=2,b=3
	            if(map.get(endChar) == 1) counter++;//new char
	            
	            //c가 1인거면 문자가 하나 등록된거(endchar)
	            end++;	//그리고 한칸 증가시킴.
	            
	            //c2개를 삭제하는거
	            while(counter > 2){
	                char cTemp = s.charAt(start);
	                map.put(cTemp, map.get(cTemp) - 1);
	                //startChar는 맵에서 꺼낸 start캐릭터에 -1을 해주면 삭제됨(cTemp)
	                if(map.get(cTemp) == 0){	//스타트캐릭터로 뽑은 애가 0이면
	                    counter--;	//카운트는 마이너스.
	                }
	                start++;	//그리고 스타트포인터 증가.
	            }
	            len = Math.max(len, end-start);
	            //이 차이만큼 end포인트 먼저 가고 스타트포인터가 따라감(그리고 뺴줌)
	        }
	        return len;
	    }
	
}