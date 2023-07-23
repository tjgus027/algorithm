import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < prices.length; i++){
            stack.push(prices.length-1-i);
            
            for(int j = i; j < prices.length; j++){
                if(prices[i] > prices[j]) {
                    stack.pop();
                    stack.push(j - i);
                    break;
                }
            }
        }
        return stack.stream().mapToInt(i -> i.intValue()).toArray();
    }
}