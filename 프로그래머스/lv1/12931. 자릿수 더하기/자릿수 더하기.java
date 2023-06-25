public class Solution {
    public int solution(int n) {
        int answer = 0;
        String toStr = Integer.toString(n);
        int len = toStr.length();
        
        for(int i = 0; i < len; i++){
            answer += toStr.charAt(i);
        }
        
        return answer - 48*len;
    }
}