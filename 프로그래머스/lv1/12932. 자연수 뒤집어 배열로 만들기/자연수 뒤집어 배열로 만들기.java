import java.util.*;
class Solution {
    public int[] solution(long n) {
        String[] s = String.valueOf(n).split("");
        int[] answer = new int[s.length];
        Stack<String> stack = new Stack<>();
        
        for(String x : s){
            stack.push(x);
        }
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(stack.pop());
        }
        return answer;
    }
}