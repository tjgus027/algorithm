import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length()-m+1; i = i+m){
            String str = my_string.substring(i, i+m);
            list.add(str);
        }
        for(String str : list){
            answer += str.charAt(c-1);
        }
        return answer;
    }
}