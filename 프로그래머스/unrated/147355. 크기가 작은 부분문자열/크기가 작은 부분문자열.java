import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num1 = Long.parseLong(p); //여기 int로 설정하면 오버플로우 
        int len = p.length(); 
        
        for(int i = 0; i < t.length() - len + 1; i++){
            //여기도 -> 결과적으로 런타임에러 발생함
            long num2 = Long.parseLong(t.substring(i, i+len)); 
            if(num2 <= num1) answer++;
        }
        
        return answer;
    }
}