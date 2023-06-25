import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numLength = nums.length / 2;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums) {
            map.put(x, 0);
        }
        
        answer = (map.size() >= numLength) ? numLength : map.size();
        
        return answer;
    }
}