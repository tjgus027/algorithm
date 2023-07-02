import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) > 47 && my_string.charAt(i) < 58){
                list.add(my_string.charAt(i));
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i) - 48;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}