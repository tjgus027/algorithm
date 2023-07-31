import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 9;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length - days; i++){
            Map<String, Integer> temp = new HashMap<>();
            
            for(int j = 0; j < 10; j++){
                String str = discount[i+j];
                temp.put(str, temp.getOrDefault(str, 0)+1);
            }
            
            Boolean b = true; 
            for(String key : map.keySet()){
                if(map.get(key) != temp.get(key)){
                    b = false;
                    break;
                }
            }
            
            answer += (b)? 1 : 0;
        }
        return answer;
    }
}