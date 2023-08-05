import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push('(');
            } else if(ch == ')'){
                if(!stack.isEmpty()){
                    if(stack.peek() == '(') stack.pop();
                } else return false;
            }
        }
        
        return (stack.isEmpty()) ? true: false;
    }
}