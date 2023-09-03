import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            if (stack.isEmpty()) {		
                stack.push(i);			
                continue;
            }
            
            while (!stack.isEmpty() && i <= stack.peek()) {		
                stack.pop();	
            }
            stack.push(i);	
        }
        return stack.stream().mapToInt(i -> i.intValue()).toArray();
    }
}