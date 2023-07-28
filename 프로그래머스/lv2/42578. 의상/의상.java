import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String[] cloth: clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 1) + 1);
        }
        for(String str: map.keySet()){
            answer *= map.get(str);
        }
        return answer-1;
    }
}