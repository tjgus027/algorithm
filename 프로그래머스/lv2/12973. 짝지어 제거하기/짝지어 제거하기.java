import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char ch : array){
            if(!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        answer = (stack.isEmpty()) ? 1 : 0;

        return answer;
    }
}