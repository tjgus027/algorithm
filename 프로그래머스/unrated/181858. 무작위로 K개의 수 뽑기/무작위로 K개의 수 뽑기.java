import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(!stack.contains(arr[i])) stack.push(arr[i]);
        }
        
        while(stack.size() != k){
            if(stack.size() < k){
                stack.push(-1);
            } else if(stack.size() > k){
                stack.pop();
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}