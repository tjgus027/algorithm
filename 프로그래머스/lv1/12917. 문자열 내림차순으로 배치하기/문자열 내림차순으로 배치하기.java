import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split("");
        
        List<String> list = Arrays.asList(s1);
        Collections.sort(list);
        Collections.reverse(list);
        
        for(String x : list){
            answer += x;
        }
        
        return answer;
    }
}